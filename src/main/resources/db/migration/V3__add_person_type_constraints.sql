
ALTER TABLE persons
    ADD CONSTRAINT chk_person_type
        CHECK (
                person_type IN ('INDIVIDUAL', 'LEGAL_ENTITY')
            );

ALTER TABLE persons
    ADD CONSTRAINT chk_individual_fields
        CHECK (
                    person_type <> 'INDIVIDUAL'
                OR (
                            first_name IS NOT NULL
                            AND TRIM(first_name) <> ''
                            AND last_name IS NOT NULL
                            AND TRIM(last_name) <> ''
                            AND document_number IS NOT NULL
                            AND TRIM(document_number) <> ''
                            AND business_name IS NULL
                            AND cuit IS NULL
                        )
            );

ALTER TABLE persons
    ADD CONSTRAINT chk_legal_entity_fields
        CHECK (
                    person_type <> 'LEGAL_ENTITY'
                OR (
                            business_name IS NOT NULL
                            AND TRIM(business_name) <> ''
                            AND cuit IS NOT NULL
                            AND TRIM(cuit) <> ''
                            AND first_name IS NULL
                            AND last_name IS NULL
                            AND document_number IS NULL
                        )
            );

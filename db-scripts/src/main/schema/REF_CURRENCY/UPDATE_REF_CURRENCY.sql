insert into DBO_SAMPLE.REF_CURRENCY (NAME, CODE, CREATED_BY, CREATED_ON, MODIFIED_BY, MODIFIED_ON, IS_DELETED)
values ('US Dollar', 'USD', 'SYSTEM', NOW(), 'SYSTEM', NOW(), FALSE),
       ('Euro', 'EUR', 'SYSTEM', NOW(), 'SYSTEM', NOW(), FALSE),
       ('British Pound', 'GBP', 'SYSTEM', NOW(), 'SYSTEM', NOW(), FALSE);
commit;
package nextstep.jdbc;

import java.sql.SQLException;

public class DataAccessException extends SQLException {

    public DataAccessException(final SQLException exception) {
        super(exception);
    }
}

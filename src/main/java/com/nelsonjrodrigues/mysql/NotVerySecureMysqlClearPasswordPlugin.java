/*
    Copyright (c) 2017 Nelson Rodrigues. All rights reserved.
*/

package com.nelsonjrodrigues.mysql;

import com.mysql.cj.mysqla.authentication.MysqlClearPasswordPlugin;

/**
 * MySQL Clear Password Authentication Plugin, 
 *
 * @author Nelson Rodrigues
 */
class NotVerySecureMysqlClearPasswordPlugin extends MysqlClearPasswordPlugin {

    public boolean requiresConfidentiality() {
        return false;
    }

}

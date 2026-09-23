package org.apache.commons.cli;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.lang.NullPointerException;
import static org.apache.commons.cli.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Boolean;

public class Parser_parse_178972289510 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term246;
     Object term266;
     Object term315;

    public Parser_parse_178972289510() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term247 = new HashMap();
        HashMap term252 = new HashMap();
        ArrayList term257 = new ArrayList();
        HashMap term261 = new HashMap();
        term246 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term246, term246.getClass(), "shortOpts", term247);
        setField(term246, term246.getClass(), "longOpts", term252);
        setField(term246, term246.getClass(), "requiredOpts", term257);
        setField(term246, term246.getClass(), "optionGroups", term261);
        term266 = (Object[]) newArray("java.lang.String", 4);
        setElement(term266, 0, "RMFIsYGgne");
        setElement(term266, 1, "NRdvgJlhkX");
        setElement(term266, 2, "uuaPigETmJ");
        setElement(term266, 3, "MxlszYVzRf");
        term315 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Parser");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.apache.commons.cli.Options");
        argTypes[1] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term246;
        args[1] = term266;
        args[2] = term315;
        try {
            callMethod(klass, "parse", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



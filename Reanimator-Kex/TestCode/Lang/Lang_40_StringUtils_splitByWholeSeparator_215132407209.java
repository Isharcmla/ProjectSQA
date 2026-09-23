package org.apache.commons.lang;

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
import static org.apache.commons.lang.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang.EqualityUtils.*;
import java.lang.Integer;
import java.lang.Object;

public class StringUtils_splitByWholeSeparator_215132407209 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2392;
     Object term12022;

    public StringUtils_splitByWholeSeparator_215132407209() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2392 = new Integer(-883034806);
        term12022 = (Object[]) newArray("java.lang.String", 1);
        setElement(term12022, 0, "QXzGXbEXMu");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.StringUtils");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = "QXzGXbEXMu";
        args[1] = "qxSDVejjiY";
        args[2] = term2392;
        Object retValue = callMethod(klass, "splitByWholeSeparator", argTypes, null, args);
        assertTrue(recursiveEquals(term2392, -883034806));
        assertTrue(recursiveEquals(retValue, term12022));
    }

};



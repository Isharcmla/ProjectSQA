package org.jsoup.helper;

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
import static org.jsoup.helper.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class DataUtil_parseByteData_170864038019 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term363;

    public DataUtil_parseByteData_170864038019() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term363 = newInstance(Class.forName("org.jsoup.parser.Parser"));
        Object term365 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        setField(term363, term363.getClass(), "treeBuilder", null);
        setIntField(term363, term363.getClass(), "maxErrors", -1922583790);
        setIntField(term365, term365.getClass(), "maxSize", 0);
        setField(term365, term365.getClass(), "elementData", null);
        setIntField(term365, term365.getClass(), "size", 0);
        setIntField(term365, term365.getClass(), "modCount", 0);
        setField(term363, term363.getClass(), "errors", term365);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.helper.DataUtil");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.nio.ByteBuffer");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("org.jsoup.parser.Parser");
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = "MjGYSRKTNF";
        args[2] = "hRNSzYYIrc";
        args[3] = term363;
        try {
            callMethod(klass, "parseByteData", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



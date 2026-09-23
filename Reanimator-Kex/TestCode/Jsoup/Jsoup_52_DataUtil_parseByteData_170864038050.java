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
import static org.jsoup.helper.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class DataUtil_parseByteData_170864038050 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7036;

    public DataUtil_parseByteData_170864038050() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7036 = newInstance(Class.forName("java.nio.DirectByteBufferR"));
        setIntField(term7036, term7036.getClass(), "limit", 4);
        setIntField(term7036, term7036.getClass(), "position", 0);
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
        args[0] = term7036;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        callMethod(klass, "parseByteData", argTypes, null, args);
    }

};



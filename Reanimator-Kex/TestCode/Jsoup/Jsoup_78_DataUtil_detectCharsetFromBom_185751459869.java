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

public class DataUtil_detectCharsetFromBom_185751459869 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term297268;

    public DataUtil_detectCharsetFromBom_185751459869() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term297268 = newInstance(Class.forName("java.nio.DirectByteBufferR"));
        setIntField(term297268, term297268.getClass(), "limit", 4);
        setIntField(term297268, term297268.getClass(), "position", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.helper.DataUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.nio.ByteBuffer");
        Object[] args = new Object[1];
        args[0] = term297268;
        callMethod(klass, "detectCharsetFromBom", argTypes, null, args);
    }

};



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
import java.io.FileNotFoundException;
import static org.jsoup.helper.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class DataUtil_readFileToByteBuffer_212676327022 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term391;

    public DataUtil_readFileToByteBuffer_212676327022() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term3613 = Class.forName((String) "java.io.File$PathStatus");
        Field term3612 = ((Class) term3613).getDeclaredField((String) "INVALID");
        ((Field) term3612).setAccessible(true);
        Object enum3 = ((Field) term3612).get((Object) null);
        term391 = newInstance(Class.forName("java.io.File"));
        setField(term391, term391.getClass(), "path", "RMFIsYGgne");
        setField(term391, term391.getClass(), "status", enum3);
        setIntField(term391, term391.getClass(), "prefixLength", -1955890973);
        setField(term391, term391.getClass(), "filePath", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.helper.DataUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.File");
        Object[] args = new Object[1];
        args[0] = term391;
        try {
            callMethod(klass, "readFileToByteBuffer", argTypes, null, args);
            assertTrue(false);
        }
        catch (FileNotFoundException e) {
        }

    }

};



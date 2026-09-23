package org.jsoup;

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
import static org.jsoup.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class Jsoup_parse_7802613916 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term386;

    public Jsoup_parse_7802613916() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term434 = Class.forName((String) "java.io.File$PathStatus");
        Field term433 = ((Class) term434).getDeclaredField((String) "INVALID");
        ((Field) term433).setAccessible(true);
        Object enum1 = ((Field) term433).get((Object) null);
        term386 = newInstance(Class.forName("java.io.File"));
        setField(term386, term386.getClass(), "path", "RMFIsYGgne");
        setField(term386, term386.getClass(), "status", enum1);
        setIntField(term386, term386.getClass(), "prefixLength", 391863371);
        setField(term386, term386.getClass(), "filePath", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.Jsoup");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.File");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term386;
        args[1] = "NRdvgJlhkX";
        callMethod(klass, "parse", argTypes, null, args);
    }

};



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

public class Jsoup_parse_1728460865 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term142;

    public Jsoup_parse_1728460865() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term224 = Class.forName((String) "java.io.File$PathStatus");
        Field term223 = ((Class) term224).getDeclaredField((String) "INVALID");
        ((Field) term223).setAccessible(true);
        Object enum0 = ((Field) term223).get((Object) null);
        term142 = newInstance(Class.forName("java.io.File"));
        setField(term142, term142.getClass(), "path", "SzjVpOQTyS");
        setField(term142, term142.getClass(), "status", enum0);
        setIntField(term142, term142.getClass(), "prefixLength", 1484323161);
        setField(term142, term142.getClass(), "filePath", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.Jsoup");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.io.File");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.String");
        Object[] args = new Object[3];
        args[0] = term142;
        args[1] = "MjGYSRKTNF";
        args[2] = "hRNSzYYIrc";
        callMethod(klass, "parse", argTypes, null, args);
    }

};



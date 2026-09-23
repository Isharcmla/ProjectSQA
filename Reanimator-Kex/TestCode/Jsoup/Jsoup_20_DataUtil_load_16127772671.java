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
import java.lang.String;
import java.lang.Object;

public class DataUtil_load_16127772671 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public DataUtil_load_16127772671() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term83 = Class.forName((String) "java.io.File$PathStatus");
        Field term82 = ((Class) term83).getDeclaredField((String) "INVALID");
        ((Field) term82).setAccessible(true);
        Object enum0 = ((Field) term82).get((Object) null);
        term1 = newInstance(Class.forName("java.io.File"));
        setField(term1, term1.getClass(), "path", "PAEBtnZtTD");
        setField(term1, term1.getClass(), "status", enum0);
        setIntField(term1, term1.getClass(), "prefixLength", 568599855);
        setField(term1, term1.getClass(), "filePath", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.helper.DataUtil");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.io.File");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.String");
        Object[] args = new Object[3];
        args[0] = term1;
        args[1] = "sjlJAEtRrb";
        args[2] = "MuLcgQHgqz";
        callMethod(klass, "load", argTypes, null, args);
    }

};



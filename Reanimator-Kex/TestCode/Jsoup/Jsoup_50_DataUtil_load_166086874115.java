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

public class DataUtil_load_166086874115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term313;

    public DataUtil_load_166086874115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term313 = newInstance(Class.forName("org.jsoup.parser.Parser"));
        Object term315 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        setField(term313, term313.getClass(), "treeBuilder", null);
        setIntField(term313, term313.getClass(), "maxErrors", 1484323161);
        setIntField(term315, term315.getClass(), "maxSize", 0);
        setField(term315, term315.getClass(), "elementData", null);
        setIntField(term315, term315.getClass(), "size", 0);
        setIntField(term315, term315.getClass(), "modCount", 0);
        setField(term313, term313.getClass(), "errors", term315);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.helper.DataUtil");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.io.InputStream");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("org.jsoup.parser.Parser");
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = "EGtDIRbSSb";
        args[2] = "SzjVpOQTyS";
        args[3] = term313;
        try {
            callMethod(klass, "load", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



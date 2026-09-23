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
import java.lang.NullPointerException;
import static org.jsoup.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Jsoup_parse_12475461224 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term654;

    public Jsoup_parse_12475461224() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term654 = newInstance(Class.forName("org.jsoup.parser.Parser"));
        Object term656 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        Object term660 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        setField(term654, term654.getClass(), "treeBuilder", null);
        setIntField(term654, term654.getClass(), "maxErrors", -616727354);
        setIntField(term656, term656.getClass(), "maxSize", 0);
        setField(term656, term656.getClass(), "elementData", null);
        setIntField(term656, term656.getClass(), "size", 0);
        setIntField(term656, term656.getClass(), "modCount", 0);
        setField(term654, term654.getClass(), "errors", term656);
        setBooleanField(term660, term660.getClass(), "preserveTagCase", false);
        setBooleanField(term660, term660.getClass(), "preserveAttributeCase", false);
        setField(term654, term654.getClass(), "settings", term660);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.Jsoup");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.io.InputStream");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("org.jsoup.parser.Parser");
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = "LQFpaHEwXR";
        args[2] = "oVcInYnLWB";
        args[3] = term654;
        try {
            callMethod(klass, "parse", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



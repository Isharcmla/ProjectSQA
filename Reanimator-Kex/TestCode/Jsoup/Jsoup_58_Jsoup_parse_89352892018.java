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

public class Jsoup_parse_89352892018 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term69;

    public Jsoup_parse_89352892018() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term69 = newInstance(Class.forName("org.jsoup.parser.Parser"));
        Object term71 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        Object term75 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        setField(term69, term69.getClass(), "treeBuilder", null);
        setIntField(term69, term69.getClass(), "maxErrors", 1162663216);
        setIntField(term71, term71.getClass(), "maxSize", 0);
        setField(term71, term71.getClass(), "elementData", null);
        setIntField(term71, term71.getClass(), "size", 0);
        setIntField(term71, term71.getClass(), "modCount", 0);
        setField(term69, term69.getClass(), "errors", term71);
        setBooleanField(term75, term75.getClass(), "preserveTagCase", false);
        setBooleanField(term75, term75.getClass(), "preserveAttributeCase", false);
        setField(term69, term69.getClass(), "settings", term75);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.Jsoup");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("org.jsoup.parser.Parser");
        Object[] args = new Object[3];
        args[0] = "MuLcgQHgqz";
        args[1] = "xxtlPwDYFs";
        args[2] = term69;
        try {
            callMethod(klass, "parse", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



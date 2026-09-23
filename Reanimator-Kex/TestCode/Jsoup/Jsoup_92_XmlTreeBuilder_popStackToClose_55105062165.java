package org.jsoup.parser;

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
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class XmlTreeBuilder_popStackToClose_55105062165 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term201936;
     Object term202066;

    public XmlTreeBuilder_popStackToClose_55105062165() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term201936 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        Object term202002 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        setBooleanField(term202002, term202002.getClass(), "preserveTagCase", true);
        setField(term201936, term201936.getClass(), "settings", term202002);
        term202066 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        setField(term202066, term202066.getClass(), "tagName", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$EndTag");
        Object[] args = new Object[1];
        args[0] = term202066;
        try {
            callMethod(klass, "popStackToClose", argTypes, term201936, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



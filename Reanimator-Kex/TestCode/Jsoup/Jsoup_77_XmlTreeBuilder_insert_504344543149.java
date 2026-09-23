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
import java.util.ArrayList;
import java.lang.StringBuilder;

public class XmlTreeBuilder_insert_504344543149 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term266700;
     Object term266884;

    public XmlTreeBuilder_insert_504344543149() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term266818 = new ArrayList();
        term266700 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        Object term266766 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        setBooleanField(term266766, term266766.getClass(), "preserveTagCase", true);
        setField(term266700, term266700.getClass(), "settings", term266766);
        setField(term266700, term266700.getClass(), "stack", term266818);
        StringBuilder term266944 = new StringBuilder();
        StringBuilder term267004 = new StringBuilder();
        StringBuilder term267064 = new StringBuilder();
        term266884 = newInstance(Class.forName("org.jsoup.parser.Token$Doctype"));
        setField(term266884, term266884.getClass(), "name", term266944);
        setField(term266884, term266884.getClass(), "publicIdentifier", term267004);
        setField(term266884, term266884.getClass(), "systemIdentifier", term267064);
        setField(term266884, term266884.getClass(), "pubSysKey", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Doctype");
        Object[] args = new Object[1];
        args[0] = term266884;
        try {
            callMethod(klass, "insert", argTypes, term266700, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



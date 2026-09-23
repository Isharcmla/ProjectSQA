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
import java.lang.StringBuilder;

public class XmlTreeBuilder_insert_196792529235 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term183360;
     Object term183426;

    public XmlTreeBuilder_insert_196792529235() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term183360 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        char[] term181792 = (char[]) newCharArray(489);
        StringBuilder term183486 = new StringBuilder();
        ((StringBuilder) term183486).append(term181792);
        term183426 = newInstance(Class.forName("org.jsoup.parser.Token$Comment"));
        setField(term183426, term183426.getClass(), "data", term183486);
        setBooleanField(term183426, term183426.getClass(), "bogus", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Comment");
        Object[] args = new Object[1];
        args[0] = term183426;
        try {
            callMethod(klass, "insert", argTypes, term183360, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



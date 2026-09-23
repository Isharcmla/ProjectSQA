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
import java.util.ArrayList;

public class XmlTreeBuilder_insert_420854838111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term132933;
     Object term133055;

    public XmlTreeBuilder_insert_420854838111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term132985 = new ArrayList();
        term132933 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term132933, term132933.getClass(), "baseUri", null);
        setField(term132933, term132933.getClass(), "stack", term132985);
        term133055 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term133055, term133055.getClass(), "data", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Character");
        Object[] args = new Object[1];
        args[0] = term133055;
        try {
            callMethod(klass, "insert", argTypes, term132933, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



package org.jsoup.nodes;

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
import static org.jsoup.nodes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.jsoup.nodes.EqualityUtils.*;
import java.lang.Object;

public class DocumentType_has_145612056650 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31462;
     Object term32681;

    public DocumentType_has_145612056650() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31462 = newInstance(Class.forName("org.jsoup.nodes.DocumentType"));
        Object term31520 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term31520, term31520.getClass(), "attributes", null);
        setField(term31462, term31462.getClass(), "attributes", term31520);
        term32681 = newInstance(Class.forName("org.jsoup.nodes.DocumentType"));
        Object term32682 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term32681, term32681.getClass(), "parentNode", null);
        setField(term32681, term32681.getClass(), "childNodes", null);
        setField(term32682, term32682.getClass(), "attributes", null);
        setField(term32681, term32681.getClass(), "attributes", term32682);
        setField(term32681, term32681.getClass(), "baseUri", null);
        setIntField(term32681, term32681.getClass(), "siblingIndex", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.DocumentType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ";
        Object retValue = callMethod(klass, "has", argTypes, term31462, args);
        assertTrue(recursiveEquals(term31462, term32681));
        assertTrue(recursiveEquals(retValue, false));
    }

};



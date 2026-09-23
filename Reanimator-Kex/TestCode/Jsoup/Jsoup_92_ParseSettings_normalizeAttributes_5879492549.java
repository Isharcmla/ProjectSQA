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
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.jsoup.parser.EqualityUtils.*;
import java.lang.Object;

public class ParseSettings_normalizeAttributes_5879492549 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58;
     Object term61;
     Object term206;
     Object term207;

    public ParseSettings_normalizeAttributes_5879492549() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term58 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        setBooleanField(term58, term58.getClass(), "preserveTagCase", false);
        setBooleanField(term58, term58.getClass(), "preserveAttributeCase", true);
        term61 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term63 = (Object[]) newArray("java.lang.String", 0);
        Object[] term64 = (Object[]) newArray("java.lang.String", 0);
        setIntField(term61, term61.getClass(), "size", 568599855);
        setField(term61, term61.getClass(), "keys", term63);
        setField(term61, term61.getClass(), "vals", term64);
        term206 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        setBooleanField(term206, term206.getClass(), "preserveTagCase", false);
        setBooleanField(term206, term206.getClass(), "preserveAttributeCase", true);
        term207 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term208 = (Object[]) newArray("java.lang.String", 0);
        Object[] term209 = (Object[]) newArray("java.lang.String", 0);
        setIntField(term207, term207.getClass(), "size", 568599855);
        setField(term207, term207.getClass(), "keys", term208);
        setField(term207, term207.getClass(), "vals", term209);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.ParseSettings");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Attributes");
        Object[] args = new Object[1];
        args[0] = term61;
        callMethod(klass, "normalizeAttributes", argTypes, term58, args);
        assertTrue(recursiveEquals(term58, term206));
        assertTrue(recursiveEquals(term61, term207));
    }

};



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

public class ParseSettings_normalizeAttributes_58794925437 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6027;
     Object term6085;
     Object term6112;
     Object term6113;
     Object term6100;

    public ParseSettings_normalizeAttributes_58794925437() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6027 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        setBooleanField(term6027, term6027.getClass(), "preserveAttributeCase", false);
        term6085 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term5926 = (Object[]) newArray("java.lang.String", 490);
        setIntField(term6085, term6085.getClass(), "size", 3);
        setField(term6085, term6085.getClass(), "keys", term5926);
        term6112 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        setBooleanField(term6112, term6112.getClass(), "preserveTagCase", false);
        setBooleanField(term6112, term6112.getClass(), "preserveAttributeCase", false);
        term6113 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term6114 = (Object[]) newArray("java.lang.String", 490);
        setIntField(term6113, term6113.getClass(), "size", 3);
        setElement(term6114, 0, "");
        setElement(term6114, 1, "");
        setElement(term6114, 2, "");
        setField(term6113, term6113.getClass(), "keys", term6114);
        setField(term6113, term6113.getClass(), "vals", null);
        term6100 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term6102 = (Object[]) newArray("java.lang.String", 490);
        setIntField(term6100, term6100.getClass(), "size", 3);
        setElement(term6102, 0, "");
        setElement(term6102, 1, "");
        setElement(term6102, 2, "");
        setField(term6100, term6100.getClass(), "keys", term6102);
        setField(term6100, term6100.getClass(), "vals", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.ParseSettings");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Attributes");
        Object[] args = new Object[1];
        args[0] = term6085;
        Object retValue = callMethod(klass, "normalizeAttributes", argTypes, term6027, args);
        assertTrue(recursiveEquals(term6027, term6112));
        assertTrue(recursiveEquals(term6085, term6113));
        assertTrue(recursiveEquals(retValue, term6100));
    }

};



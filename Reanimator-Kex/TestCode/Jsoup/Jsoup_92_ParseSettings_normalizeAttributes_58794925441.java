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

public class ParseSettings_normalizeAttributes_58794925441 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6545;
     Object term6603;
     Object term6718;
     Object term6719;
     Object term6690;

    public ParseSettings_normalizeAttributes_58794925441() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6545 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        setBooleanField(term6545, term6545.getClass(), "preserveAttributeCase", false);
        term6603 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term6394 = (Object[]) newArray("java.lang.String", 32);
        setIntField(term6603, term6603.getClass(), "size", 11);
        setElement(term6394, 2, "");
        setField(term6603, term6603.getClass(), "keys", term6394);
        term6718 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        setBooleanField(term6718, term6718.getClass(), "preserveTagCase", false);
        setBooleanField(term6718, term6718.getClass(), "preserveAttributeCase", false);
        term6719 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term6720 = (Object[]) newArray("java.lang.String", 32);
        setIntField(term6719, term6719.getClass(), "size", 11);
        setElement(term6720, 0, "");
        setElement(term6720, 1, "");
        setElement(term6720, 2, "");
        setElement(term6720, 3, "");
        setElement(term6720, 4, "");
        setElement(term6720, 5, "");
        setElement(term6720, 6, "");
        setElement(term6720, 7, "");
        setElement(term6720, 8, "");
        setElement(term6720, 9, "");
        setElement(term6720, 10, "");
        setField(term6719, term6719.getClass(), "keys", term6720);
        setField(term6719, term6719.getClass(), "vals", null);
        term6690 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term6692 = (Object[]) newArray("java.lang.String", 32);
        setIntField(term6690, term6690.getClass(), "size", 11);
        setElement(term6692, 0, "");
        setElement(term6692, 1, "");
        setElement(term6692, 2, "");
        setElement(term6692, 3, "");
        setElement(term6692, 4, "");
        setElement(term6692, 5, "");
        setElement(term6692, 6, "");
        setElement(term6692, 7, "");
        setElement(term6692, 8, "");
        setElement(term6692, 9, "");
        setElement(term6692, 10, "");
        setField(term6690, term6690.getClass(), "keys", term6692);
        setField(term6690, term6690.getClass(), "vals", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.ParseSettings");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Attributes");
        Object[] args = new Object[1];
        args[0] = term6603;
        Object retValue = callMethod(klass, "normalizeAttributes", argTypes, term6545, args);
        assertTrue(recursiveEquals(term6545, term6718));
        assertTrue(recursiveEquals(term6603, term6719));
        assertTrue(recursiveEquals(retValue, term6690));
    }

};



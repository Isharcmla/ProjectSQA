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
import java.lang.Boolean;
import java.lang.Object;

public class XmlDeclaration_init_20965885957 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25;
     Object term1025;

    public XmlDeclaration_init_20965885957() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25 = new Boolean(false);
        term1025 = newInstance(Class.forName("org.jsoup.nodes.XmlDeclaration"));
        Object term1028 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        Object term1029 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term1025, term1025.getClass(), "name", "PAEBtnZtTD");
        setBooleanField(term1025, term1025.getClass(), "isProcessingInstruction", false);
        setField(term1025, term1025.getClass(), "parentNode", null);
        setIntField(term1028, term1028.getClass(), "modCount", 0);
        setField(term1025, term1025.getClass(), "childNodes", term1028);
        setField(term1029, term1029.getClass(), "attributes", null);
        setField(term1025, term1025.getClass(), "attributes", term1029);
        setField(term1025, term1025.getClass(), "baseUri", "sjlJAEtRrb");
        setIntField(term1025, term1025.getClass(), "siblingIndex", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.XmlDeclaration");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = "PAEBtnZtTD";
        args[1] = "sjlJAEtRrb";
        args[2] = term25;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term1025));
        assertTrue(recursiveEquals(term25, false));
    }

};



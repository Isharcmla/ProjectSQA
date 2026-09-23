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
import java.util.LinkedHashMap;

public class DocumentType_has_145612056659 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41150;
     Object term41520;

    public DocumentType_has_145612056659() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term41268 = new LinkedHashMap();
        ((LinkedHashMap) term41268).put("", "");
        term41150 = newInstance(Class.forName("org.jsoup.nodes.DocumentType"));
        Object term41208 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term41208, term41208.getClass(), "attributes", term41268);
        setField(term41150, term41150.getClass(), "attributes", term41208);
        LinkedHashMap term41522 = new LinkedHashMap();
        term41520 = newInstance(Class.forName("org.jsoup.nodes.DocumentType"));
        Object term41521 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term41520, term41520.getClass(), "parentNode", null);
        setField(term41520, term41520.getClass(), "childNodes", null);
        setField(term41521, term41521.getClass(), "attributes", term41522);
        setField(term41520, term41520.getClass(), "attributes", term41521);
        setField(term41520, term41520.getClass(), "baseUri", null);
        setIntField(term41520, term41520.getClass(), "siblingIndex", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.DocumentType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "         ";
        Object retValue = callMethod(klass, "has", argTypes, term41150, args);
        assertTrue(recursiveEquals(term41150, term41520));
        assertTrue(recursiveEquals(retValue, false));
    }

};



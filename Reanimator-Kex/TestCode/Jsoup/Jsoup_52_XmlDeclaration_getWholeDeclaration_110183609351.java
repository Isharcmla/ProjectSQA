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

public class XmlDeclaration_getWholeDeclaration_110183609351 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12199;
     Object term12390;

    public XmlDeclaration_getWholeDeclaration_110183609351() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term12355 = new LinkedHashMap();
        term12199 = newInstance(Class.forName("org.jsoup.nodes.XmlDeclaration"));
        Object term12295 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term12199, term12199.getClass(), "name", "xml");
        setField(term12295, term12295.getClass(), "attributes", term12355);
        setField(term12199, term12199.getClass(), "attributes", term12295);
        LinkedHashMap term12394 = new LinkedHashMap();
        term12390 = newInstance(Class.forName("org.jsoup.nodes.XmlDeclaration"));
        Object term12393 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term12390, term12390.getClass(), "name", "xml");
        setBooleanField(term12390, term12390.getClass(), "isProcessingInstruction", false);
        setField(term12390, term12390.getClass(), "parentNode", null);
        setField(term12390, term12390.getClass(), "childNodes", null);
        setField(term12393, term12393.getClass(), "attributes", term12394);
        setField(term12390, term12390.getClass(), "attributes", term12393);
        setField(term12390, term12390.getClass(), "baseUri", null);
        setIntField(term12390, term12390.getClass(), "siblingIndex", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.XmlDeclaration");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getWholeDeclaration", argTypes, term12199, args);
        assertTrue(recursiveEquals(term12199, term12390));
        assertTrue(recursiveEquals(retValue, "xml"));
    }

};



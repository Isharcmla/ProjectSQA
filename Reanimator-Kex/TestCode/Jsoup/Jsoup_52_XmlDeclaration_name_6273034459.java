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
import java.util.ArrayList;
import java.lang.Object;
import java.util.LinkedHashMap;

public class XmlDeclaration_name_6273034459 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term110;
     Object term1273;

    public XmlDeclaration_name_6273034459() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term124 = new ArrayList();
        ((ArrayList) term124).add((Object)null);
        ((ArrayList) term124).add((Object)null);
        ((ArrayList) term124).add((Object)null);
        ((ArrayList) term124).add((Object)null);
        LinkedHashMap term129 = new LinkedHashMap();
        term110 = newInstance(Class.forName("org.jsoup.nodes.XmlDeclaration"));
        Object term128 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term110, term110.getClass(), "name", "MjGYSRKTNF");
        setBooleanField(term110, term110.getClass(), "isProcessingInstruction", false);
        setField(term110, term110.getClass(), "parentNode", null);
        setField(term110, term110.getClass(), "childNodes", term124);
        setField(term128, term128.getClass(), "attributes", term129);
        setField(term110, term110.getClass(), "attributes", term128);
        setField(term110, term110.getClass(), "baseUri", "uuaPigETmJ");
        setIntField(term110, term110.getClass(), "siblingIndex", 1162663216);
        ArrayList term1276 = new ArrayList();
        ((ArrayList) term1276).add((Object)null);
        ((ArrayList) term1276).add((Object)null);
        ((ArrayList) term1276).add((Object)null);
        ((ArrayList) term1276).add((Object)null);
        LinkedHashMap term1279 = new LinkedHashMap();
        term1273 = newInstance(Class.forName("org.jsoup.nodes.XmlDeclaration"));
        Object term1278 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term1273, term1273.getClass(), "name", "MjGYSRKTNF");
        setBooleanField(term1273, term1273.getClass(), "isProcessingInstruction", false);
        setField(term1273, term1273.getClass(), "parentNode", null);
        setField(term1273, term1273.getClass(), "childNodes", term1276);
        setField(term1278, term1278.getClass(), "attributes", term1279);
        setField(term1273, term1273.getClass(), "attributes", term1278);
        setField(term1273, term1273.getClass(), "baseUri", "uuaPigETmJ");
        setIntField(term1273, term1273.getClass(), "siblingIndex", 1162663216);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.XmlDeclaration");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "name", argTypes, term110, args);
        assertTrue(recursiveEquals(term110, term1273));
        assertTrue(recursiveEquals(retValue, "MjGYSRKTNF"));
    }

};



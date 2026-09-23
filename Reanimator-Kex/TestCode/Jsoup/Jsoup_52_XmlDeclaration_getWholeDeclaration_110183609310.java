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

public class XmlDeclaration_getWholeDeclaration_110183609310 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term173;
     Object term1383;

    public XmlDeclaration_getWholeDeclaration_110183609310() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term187 = new ArrayList();
        ((ArrayList) term187).add((Object)null);
        ((ArrayList) term187).add((Object)null);
        ((ArrayList) term187).add((Object)null);
        LinkedHashMap term192 = new LinkedHashMap();
        term173 = newInstance(Class.forName("org.jsoup.nodes.XmlDeclaration"));
        Object term191 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term173, term173.getClass(), "name", "MxlszYVzRf");
        setBooleanField(term173, term173.getClass(), "isProcessingInstruction", false);
        setField(term173, term173.getClass(), "parentNode", null);
        setField(term173, term173.getClass(), "childNodes", term187);
        setField(term191, term191.getClass(), "attributes", term192);
        setField(term173, term173.getClass(), "attributes", term191);
        setField(term173, term173.getClass(), "baseUri", "ZiaGIbnzTs");
        setIntField(term173, term173.getClass(), "siblingIndex", 1484323161);
        ArrayList term1386 = new ArrayList();
        ((ArrayList) term1386).add((Object)null);
        ((ArrayList) term1386).add((Object)null);
        ((ArrayList) term1386).add((Object)null);
        LinkedHashMap term1389 = new LinkedHashMap();
        term1383 = newInstance(Class.forName("org.jsoup.nodes.XmlDeclaration"));
        Object term1388 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term1383, term1383.getClass(), "name", "MxlszYVzRf");
        setBooleanField(term1383, term1383.getClass(), "isProcessingInstruction", false);
        setField(term1383, term1383.getClass(), "parentNode", null);
        setField(term1383, term1383.getClass(), "childNodes", term1386);
        setField(term1388, term1388.getClass(), "attributes", term1389);
        setField(term1383, term1383.getClass(), "attributes", term1388);
        setField(term1383, term1383.getClass(), "baseUri", "ZiaGIbnzTs");
        setIntField(term1383, term1383.getClass(), "siblingIndex", 1484323161);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.XmlDeclaration");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getWholeDeclaration", argTypes, term173, args);
        assertTrue(recursiveEquals(term173, term1383));
        assertTrue(recursiveEquals(retValue, "MxlszYVzRf"));
    }

};



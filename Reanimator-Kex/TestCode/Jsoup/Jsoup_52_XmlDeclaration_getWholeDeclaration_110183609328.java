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

public class XmlDeclaration_getWholeDeclaration_110183609328 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6749;
     Object term7433;

    public XmlDeclaration_getWholeDeclaration_110183609328() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6749 = newInstance(Class.forName("org.jsoup.nodes.XmlDeclaration"));
        Object term6845 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term6749, term6749.getClass(), "name", "xml");
        setField(term6749, term6749.getClass(), "attributes", term6845);
        term7433 = newInstance(Class.forName("org.jsoup.nodes.XmlDeclaration"));
        Object term7436 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term7433, term7433.getClass(), "name", "xml");
        setBooleanField(term7433, term7433.getClass(), "isProcessingInstruction", false);
        setField(term7433, term7433.getClass(), "parentNode", null);
        setField(term7433, term7433.getClass(), "childNodes", null);
        setField(term7436, term7436.getClass(), "attributes", null);
        setField(term7433, term7433.getClass(), "attributes", term7436);
        setField(term7433, term7433.getClass(), "baseUri", null);
        setIntField(term7433, term7433.getClass(), "siblingIndex", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.XmlDeclaration");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getWholeDeclaration", argTypes, term6749, args);
        assertTrue(recursiveEquals(term6749, term7433));
        assertTrue(recursiveEquals(retValue, "xml"));
    }

};



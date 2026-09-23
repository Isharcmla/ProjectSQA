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

public class XmlDeclaration_getWholeDeclaration_110183609357 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13779;
     Object term14080;

    public XmlDeclaration_getWholeDeclaration_110183609357() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term13935 = new LinkedHashMap();
        ((LinkedHashMap) term13935).put((Object)null, (Object)null);
        ((LinkedHashMap) term13935).put((Object)null, (Object)null);
        term13779 = newInstance(Class.forName("org.jsoup.nodes.XmlDeclaration"));
        Object term13875 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term13779, term13779.getClass(), "name", "xml");
        setField(term13875, term13875.getClass(), "attributes", term13935);
        setField(term13779, term13779.getClass(), "attributes", term13875);
        LinkedHashMap term14084 = new LinkedHashMap();
        term14080 = newInstance(Class.forName("org.jsoup.nodes.XmlDeclaration"));
        Object term14083 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term14080, term14080.getClass(), "name", "xml");
        setBooleanField(term14080, term14080.getClass(), "isProcessingInstruction", false);
        setField(term14080, term14080.getClass(), "parentNode", null);
        setField(term14080, term14080.getClass(), "childNodes", null);
        setField(term14083, term14083.getClass(), "attributes", term14084);
        setField(term14080, term14080.getClass(), "attributes", term14083);
        setField(term14080, term14080.getClass(), "baseUri", null);
        setIntField(term14080, term14080.getClass(), "siblingIndex", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.XmlDeclaration");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getWholeDeclaration", argTypes, term13779, args);
        assertTrue(recursiveEquals(term13779, term14080));
        assertTrue(recursiveEquals(retValue, "xml"));
    }

};



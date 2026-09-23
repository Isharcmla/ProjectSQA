package org.apache.commons.jxpath.ri.model.jdom;

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
import java.lang.ClassCastException;
import static org.apache.commons.jxpath.ri.model.jdom.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;

public class JDOMNodePointer_getRelativePositionOfTextNode_144803629377 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2242;

    public JDOMNodePointer_getRelativePositionOfTextNode_144803629377() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2264 = new HashMap();
        HashMap term2269 = new HashMap();
        HashMap term2275 = new HashMap();
        HashMap term2280 = new HashMap();
        HashMap term2286 = new HashMap();
        HashMap term2291 = new HashMap();
        term2242 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term2243 = newInstance(Class.forName("java.lang.Object"));
        Object term2258 = newInstance(Class.forName("java.lang.Object"));
        Object term2259 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2260 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2261 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2262 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term2242, term2242.getClass(), "node", term2243);
        setField(term2242, term2242.getClass(), "id", "tShwQLRGNe");
        setIntField(term2242, term2242.getClass(), "index", -244121226);
        setBooleanField(term2242, term2242.getClass(), "attribute", true);
        setField(term2242, term2242.getClass(), "rootNode", term2258);
        setField(term2262, term2262.getClass(), "parent", null);
        setField(term2262, term2262.getClass(), "namespaceMap", null);
        setField(term2262, term2262.getClass(), "reverseMap", null);
        setField(term2262, term2262.getClass(), "pointer", null);
        setField(term2262, term2262.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term2262, term2262.getClass(), "sealed", false);
        setField(term2261, term2261.getClass(), "parent", term2262);
        setField(term2261, term2261.getClass(), "namespaceMap", term2264);
        setField(term2261, term2261.getClass(), "reverseMap", term2269);
        setField(term2261, term2261.getClass(), "pointer", null);
        setField(term2261, term2261.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term2261, term2261.getClass(), "sealed", false);
        setField(term2260, term2260.getClass(), "parent", term2261);
        setField(term2260, term2260.getClass(), "namespaceMap", term2275);
        setField(term2260, term2260.getClass(), "reverseMap", term2280);
        setField(term2260, term2260.getClass(), "pointer", null);
        setField(term2260, term2260.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term2260, term2260.getClass(), "sealed", false);
        setField(term2259, term2259.getClass(), "parent", term2260);
        setField(term2259, term2259.getClass(), "namespaceMap", term2286);
        setField(term2259, term2259.getClass(), "reverseMap", term2291);
        setField(term2259, term2259.getClass(), "pointer", null);
        setField(term2259, term2259.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term2259, term2259.getClass(), "sealed", false);
        setField(term2242, term2242.getClass(), "namespaceResolver", term2259);
        setField(term2242, term2242.getClass(), "parent", null);
        setField(term2242, term2242.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getRelativePositionOfTextNode", argTypes, term2242, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};



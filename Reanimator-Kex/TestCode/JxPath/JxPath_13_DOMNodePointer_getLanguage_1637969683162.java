package org.apache.commons.jxpath.ri.model.dom;

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
import static org.apache.commons.jxpath.ri.model.dom.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.jxpath.ri.model.dom.EqualityUtils.*;
import java.lang.Object;

public class DOMNodePointer_getLanguage_1637969683162 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30703;
     Object term31265;

    public DOMNodePointer_getLanguage_1637969683162() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30703 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term30787 = newInstance(Class.forName("org.apache.html.dom.HTMLMenuElementImpl"));
        setField(term30703, term30703.getClass(), "node", term30787);
        term31265 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term31266 = newInstance(Class.forName("org.apache.html.dom.HTMLMenuElementImpl"));
        setField(term31266, term31266.getClass(), "name", null);
        setField(term31266, term31266.getClass(), "attributes", null);
        setField(term31266, term31266.getClass(), "ownerDocument", null);
        setField(term31266, term31266.getClass(), "firstChild", null);
        setField(term31266, term31266.getClass(), "fNodeListCache", null);
        setField(term31266, term31266.getClass(), "previousSibling", null);
        setField(term31266, term31266.getClass(), "nextSibling", null);
        setField(term31266, term31266.getClass(), "ownerNode", null);
        setShortField(term31266, term31266.getClass(), "flags", (short) 0);
        setField(term31265, term31265.getClass(), "node", term31266);
        setField(term31265, term31265.getClass(), "namespaces", null);
        setField(term31265, term31265.getClass(), "defaultNamespace", null);
        setField(term31265, term31265.getClass(), "id", null);
        setIntField(term31265, term31265.getClass(), "index", 0);
        setBooleanField(term31265, term31265.getClass(), "attribute", false);
        setField(term31265, term31265.getClass(), "rootNode", null);
        setField(term31265, term31265.getClass(), "namespaceResolver", null);
        setField(term31265, term31265.getClass(), "parent", null);
        setField(term31265, term31265.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getLanguage", argTypes, term30703, args);
        assertTrue(recursiveEquals(term30703, term31265));
        assertTrue(recursiveEquals(retValue, null));
    }

};



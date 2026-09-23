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

public class DOMNodePointer_getNamespaceURI_378658202261 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71508;
     Object term73617;

    public DOMNodePointer_getNamespaceURI_378658202261() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term71508 = newInstance(Class.forName("org.apache.html.dom.HTMLInputElementImpl"));
        setShortField(term71508, term71508.getClass(), "flags", (short) 0);
        setField(term71508, term71508.getClass(), "name", "");
        term73617 = newInstance(Class.forName("org.apache.html.dom.HTMLInputElementImpl"));
        setField(term73617, term73617.getClass(), "name", "");
        setField(term73617, term73617.getClass(), "attributes", null);
        setField(term73617, term73617.getClass(), "ownerDocument", null);
        setField(term73617, term73617.getClass(), "firstChild", null);
        setField(term73617, term73617.getClass(), "fNodeListCache", null);
        setField(term73617, term73617.getClass(), "previousSibling", null);
        setField(term73617, term73617.getClass(), "nextSibling", null);
        setField(term73617, term73617.getClass(), "ownerNode", null);
        setShortField(term73617, term73617.getClass(), "flags", (short) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.w3c.dom.Node");
        Object[] args = new Object[1];
        args[0] = term71508;
        Object retValue = callMethod(klass, "getNamespaceURI", argTypes, null, args);
        assertTrue(recursiveEquals(term71508, term73617));
        assertTrue(recursiveEquals(retValue, null));
    }

};



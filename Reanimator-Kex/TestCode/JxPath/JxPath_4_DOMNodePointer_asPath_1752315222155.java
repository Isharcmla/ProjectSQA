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

public class DOMNodePointer_asPath_1752315222155 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29654;
     Object term29741;

    public DOMNodePointer_asPath_1752315222155() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29654 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        setField(term29654, term29654.getClass(), "id", "");
        term29741 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        setField(term29741, term29741.getClass(), "node", null);
        setField(term29741, term29741.getClass(), "namespaces", null);
        setField(term29741, term29741.getClass(), "defaultNamespace", null);
        setField(term29741, term29741.getClass(), "id", "");
        setIntField(term29741, term29741.getClass(), "index", 0);
        setBooleanField(term29741, term29741.getClass(), "attribute", false);
        setField(term29741, term29741.getClass(), "rootNode", null);
        setField(term29741, term29741.getClass(), "namespaceResolver", null);
        setField(term29741, term29741.getClass(), "parent", null);
        setField(term29741, term29741.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "asPath", argTypes, term29654, args);
        assertTrue(recursiveEquals(term29654, term29741));
        assertTrue(recursiveEquals(retValue, "id(\'\')"));
    }

};



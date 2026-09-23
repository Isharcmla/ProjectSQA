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
import static org.apache.commons.jxpath.ri.model.jdom.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.jxpath.ri.model.jdom.EqualityUtils.*;

public class JDOMNodePointer_nodeParent_962065921167 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29199;
     Object term29204;

    public JDOMNodePointer_nodeParent_962065921167() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29199 = newInstance(Class.forName("org.jdom.Element"));
        term29204 = newInstance(Class.forName("org.jdom.Element"));
        setField(term29204, term29204.getClass(), "name", null);
        setField(term29204, term29204.getClass(), "namespace", null);
        setField(term29204, term29204.getClass(), "additionalNamespaces", null);
        setField(term29204, term29204.getClass(), "attributes", null);
        setField(term29204, term29204.getClass(), "content", null);
        setField(term29204, term29204.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term29199;
        Object retValue = callMethod(klass, "nodeParent", argTypes, null, args);
        assertTrue(recursiveEquals(term29199, term29204));
        assertTrue(recursiveEquals(retValue, null));
    }

};



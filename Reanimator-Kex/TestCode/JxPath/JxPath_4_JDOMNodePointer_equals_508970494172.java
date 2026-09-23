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

public class JDOMNodePointer_equals_508970494172 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27844;
     Object term27973;
     Object term27974;

    public JDOMNodePointer_equals_508970494172() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27844 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        term27973 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        setField(term27973, term27973.getClass(), "node", null);
        setField(term27973, term27973.getClass(), "id", null);
        setIntField(term27973, term27973.getClass(), "index", 0);
        setBooleanField(term27973, term27973.getClass(), "attribute", false);
        setField(term27973, term27973.getClass(), "rootNode", null);
        setField(term27973, term27973.getClass(), "namespaceResolver", null);
        setField(term27973, term27973.getClass(), "parent", null);
        setField(term27973, term27973.getClass(), "locale", null);
        term27974 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        setField(term27974, term27974.getClass(), "node", null);
        setField(term27974, term27974.getClass(), "id", null);
        setIntField(term27974, term27974.getClass(), "index", 0);
        setBooleanField(term27974, term27974.getClass(), "attribute", false);
        setField(term27974, term27974.getClass(), "rootNode", null);
        setField(term27974, term27974.getClass(), "namespaceResolver", null);
        setField(term27974, term27974.getClass(), "parent", null);
        setField(term27974, term27974.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term27844;
        Object retValue = callMethod(klass, "equals", argTypes, term27844, args);
        assertTrue(recursiveEquals(term27844, term27973));
        assertTrue(recursiveEquals(term27844, term27974));
        assertTrue(recursiveEquals(retValue, true));
    }

};



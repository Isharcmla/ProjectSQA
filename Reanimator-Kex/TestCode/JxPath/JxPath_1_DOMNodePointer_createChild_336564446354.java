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
import java.lang.Object;
import java.lang.StringBuilder;

public class DOMNodePointer_createChild_336564446354 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term158839;
     Object term159195;

    public DOMNodePointer_createChild_336564446354() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuilder term159079 = new StringBuilder();
        term158839 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term158945 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.VariablePointer"));
        Object term159019 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term158839, term158839.getClass(), "id", null);
        setField(term158945, term158945.getClass(), "name", term159019);
        setBooleanField(term158945, term158945.getClass(), "actual", false);
        setIntField(term158945, term158945.getClass(), "index", 2147483647);
        setField(term158839, term158839.getClass(), "parent", term158945);
        setField(term158839, term158839.getClass(), "node", term159079);
        term159195 = newInstance(Class.forName("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        setField(term159195, term159195.getClass(), "factory", null);
        setField(term159195, term159195.getClass(), "parentContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.JXPathContext");
        argTypes[1] = Class.forName("org.apache.commons.jxpath.ri.QName");
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term159195;
        args[1] = null;
        args[2] = 2147483647;
        callMethod(klass, "createChild", argTypes, term158839, args);
    }

};

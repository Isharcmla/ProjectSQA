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
import java.lang.NullPointerException;
import static org.apache.commons.jxpath.ri.model.dom.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class DOMNodePointer_getRelativePositionByQName_171057332200 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40547;

    public DOMNodePointer_getRelativePositionByQName_171057332200() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term40547 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term40631 = newInstance(Class.forName("org.apache.wml.dom.WMLSetvarElementImpl"));
        Object term40715 = newInstance(Class.forName("org.apache.wml.dom.WMLSetvarElementImpl"));
        setShortField(term40631, term40631.getClass(), "flags", (short) 0);
        setField(term40631, term40631.getClass(), "previousSibling", term40715);
        setField(term40547, term40547.getClass(), "node", term40631);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getRelativePositionByQName", argTypes, term40547, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



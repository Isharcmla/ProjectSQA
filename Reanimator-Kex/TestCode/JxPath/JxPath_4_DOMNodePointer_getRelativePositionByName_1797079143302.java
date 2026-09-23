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

public class DOMNodePointer_getRelativePositionByName_1797079143302 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term91221;

    public DOMNodePointer_getRelativePositionByName_1797079143302() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term91221 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term91301 = newInstance(Class.forName("org.apache.wml.dom.WMLMetaElementImpl"));
        Object term91381 = newInstance(Class.forName("org.apache.wml.dom.WMLMetaElementImpl"));
        setShortField(term91301, term91301.getClass(), "flags", (short) 0);
        setField(term91301, term91301.getClass(), "previousSibling", term91381);
        setField(term91221, term91221.getClass(), "node", term91301);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getRelativePositionByName", argTypes, term91221, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



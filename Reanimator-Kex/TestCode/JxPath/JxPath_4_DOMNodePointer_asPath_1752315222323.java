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

public class DOMNodePointer_asPath_1752315222323 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term100723;

    public DOMNodePointer_asPath_1752315222323() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term100723 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term100835 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term100923 = newInstance(Class.forName("org.apache.html.dom.HTMLIFrameElementImpl"));
        Object term101001 = newInstance(Class.forName("org.apache.wml.dom.WMLWmlElementImpl"));
        setField(term100723, term100723.getClass(), "id", null);
        setField(term100835, term100835.getClass(), "id", null);
        setField(term100835, term100835.getClass(), "parent", null);
        setField(term100835, term100835.getClass(), "node", term100923);
        setField(term100723, term100723.getClass(), "parent", term100835);
        setField(term100723, term100723.getClass(), "node", term101001);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "asPath", argTypes, term100723, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



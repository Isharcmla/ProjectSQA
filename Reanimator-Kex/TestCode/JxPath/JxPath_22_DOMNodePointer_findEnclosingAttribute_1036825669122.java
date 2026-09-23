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

public class DOMNodePointer_findEnclosingAttribute_1036825669122 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20557;
     Object term20774;

    public DOMNodePointer_findEnclosingAttribute_1036825669122() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20557 = newInstance(Class.forName("org.apache.xerces.dom.EntityReferenceImpl"));
        term20774 = newInstance(Class.forName("org.apache.xerces.dom.EntityReferenceImpl"));
        setField(term20774, term20774.getClass(), "name", null);
        setField(term20774, term20774.getClass(), "baseURI", null);
        setField(term20774, term20774.getClass(), "ownerDocument", null);
        setField(term20774, term20774.getClass(), "firstChild", null);
        setField(term20774, term20774.getClass(), "fNodeListCache", null);
        setField(term20774, term20774.getClass(), "previousSibling", null);
        setField(term20774, term20774.getClass(), "nextSibling", null);
        setField(term20774, term20774.getClass(), "ownerNode", null);
        setShortField(term20774, term20774.getClass(), "flags", (short) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.w3c.dom.Node");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term20557;
        args[1] = null;
        Object retValue = callMethod(klass, "findEnclosingAttribute", argTypes, null, args);
        assertTrue(recursiveEquals(term20557, term20774));
        assertTrue(recursiveEquals(retValue, null));
    }

};



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

public class DOMNodePointer_getRelativePositionOfTextNode_767316437374 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term134039;

    public DOMNodePointer_getRelativePositionOfTextNode_767316437374() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term134039 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term134133 = newInstance(Class.forName("org.apache.html.dom.HTMLParagraphElementImpl"));
        Object term134227 = newInstance(Class.forName("org.apache.html.dom.HTMLParagraphElementImpl"));
        Object term134321 = newInstance(Class.forName("org.apache.html.dom.HTMLParagraphElementImpl"));
        setShortField(term134133, term134133.getClass(), "flags", (short) 0);
        setShortField(term134227, term134227.getClass(), "flags", (short) 0);
        setShortField(term134321, term134321.getClass(), "flags", (short) 0);
        setField(term134321, term134321.getClass(), "previousSibling", term134321);
        setField(term134227, term134227.getClass(), "previousSibling", term134321);
        setField(term134133, term134133.getClass(), "previousSibling", term134227);
        setField(term134039, term134039.getClass(), "node", term134133);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRelativePositionOfTextNode", argTypes, term134039, args);
    }

};



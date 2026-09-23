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
import java.lang.Object;

public class DOMNodePointer_getRelativePositionOfTextNode_767316437299 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term90501;
     Object term91079;

    public DOMNodePointer_getRelativePositionOfTextNode_767316437299() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term90501 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term90595 = newInstance(Class.forName("org.apache.html.dom.HTMLParagraphElementImpl"));
        Object term90689 = newInstance(Class.forName("org.apache.html.dom.HTMLParagraphElementImpl"));
        Object term90783 = newInstance(Class.forName("org.apache.html.dom.HTMLParagraphElementImpl"));
        Object term90877 = newInstance(Class.forName("org.apache.html.dom.HTMLParagraphElementImpl"));
        setShortField(term90595, term90595.getClass(), "flags", (short) 0);
        setShortField(term90689, term90689.getClass(), "flags", (short) 0);
        setShortField(term90783, term90783.getClass(), "flags", (short) 0);
        setField(term90783, term90783.getClass(), "previousSibling", term90877);
        setField(term90689, term90689.getClass(), "previousSibling", term90783);
        setField(term90595, term90595.getClass(), "previousSibling", term90689);
        setField(term90501, term90501.getClass(), "node", term90595);
        term91079 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term91080 = newInstance(Class.forName("org.apache.html.dom.HTMLParagraphElementImpl"));
        Object term91081 = newInstance(Class.forName("org.apache.html.dom.HTMLParagraphElementImpl"));
        Object term91082 = newInstance(Class.forName("org.apache.html.dom.HTMLParagraphElementImpl"));
        Object term91083 = newInstance(Class.forName("org.apache.html.dom.HTMLParagraphElementImpl"));
        setField(term91080, term91080.getClass(), "name", null);
        setField(term91080, term91080.getClass(), "attributes", null);
        setField(term91080, term91080.getClass(), "ownerDocument", null);
        setField(term91080, term91080.getClass(), "firstChild", null);
        setField(term91080, term91080.getClass(), "fNodeListCache", null);
        setField(term91081, term91081.getClass(), "name", null);
        setField(term91081, term91081.getClass(), "attributes", null);
        setField(term91081, term91081.getClass(), "ownerDocument", null);
        setField(term91081, term91081.getClass(), "firstChild", null);
        setField(term91081, term91081.getClass(), "fNodeListCache", null);
        setField(term91082, term91082.getClass(), "name", null);
        setField(term91082, term91082.getClass(), "attributes", null);
        setField(term91082, term91082.getClass(), "ownerDocument", null);
        setField(term91082, term91082.getClass(), "firstChild", null);
        setField(term91082, term91082.getClass(), "fNodeListCache", null);
        setField(term91083, term91083.getClass(), "name", null);
        setField(term91083, term91083.getClass(), "attributes", null);
        setField(term91083, term91083.getClass(), "ownerDocument", null);
        setField(term91083, term91083.getClass(), "firstChild", null);
        setField(term91083, term91083.getClass(), "fNodeListCache", null);
        setField(term91083, term91083.getClass(), "previousSibling", null);
        setField(term91083, term91083.getClass(), "nextSibling", null);
        setField(term91083, term91083.getClass(), "ownerNode", null);
        setShortField(term91083, term91083.getClass(), "flags", (short) 0);
        setField(term91082, term91082.getClass(), "previousSibling", term91083);
        setField(term91082, term91082.getClass(), "nextSibling", null);
        setField(term91082, term91082.getClass(), "ownerNode", null);
        setShortField(term91082, term91082.getClass(), "flags", (short) 0);
        setField(term91081, term91081.getClass(), "previousSibling", term91082);
        setField(term91081, term91081.getClass(), "nextSibling", null);
        setField(term91081, term91081.getClass(), "ownerNode", null);
        setShortField(term91081, term91081.getClass(), "flags", (short) 0);
        setField(term91080, term91080.getClass(), "previousSibling", term91081);
        setField(term91080, term91080.getClass(), "nextSibling", null);
        setField(term91080, term91080.getClass(), "ownerNode", null);
        setShortField(term91080, term91080.getClass(), "flags", (short) 0);
        setField(term91079, term91079.getClass(), "node", term91080);
        setField(term91079, term91079.getClass(), "namespaces", null);
        setField(term91079, term91079.getClass(), "defaultNamespace", null);
        setField(term91079, term91079.getClass(), "id", null);
        setIntField(term91079, term91079.getClass(), "index", 0);
        setBooleanField(term91079, term91079.getClass(), "attribute", false);
        setField(term91079, term91079.getClass(), "rootNode", null);
        setField(term91079, term91079.getClass(), "namespaceResolver", null);
        setField(term91079, term91079.getClass(), "parent", null);
        setField(term91079, term91079.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRelativePositionOfTextNode", argTypes, term90501, args);
        assertTrue(recursiveEquals(term90501, term91079));
    }

};



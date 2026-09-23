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
import java.util.HashMap;

public class DOMAttributeIterator_getAttribute_539782597339 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5750125;
     Object term5750699;
     Object term5750773;
     Object term5750928;
     Object term5750933;
     Object term5750938;

    public DOMAttributeIterator_getAttribute_539782597339() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term5750395 = new HashMap();
        ((HashMap) term5750395).put("", "");
        term5750125 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        Object term5750249 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.NullElementPointer"));
        Object term5750347 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term5750347, term5750347.getClass(), "namespaceMap", term5750395);
        setField(term5750249, term5750249.getClass(), "namespaceResolver", term5750347);
        setField(term5750125, term5750125.getClass(), "parent", term5750249);
        term5750699 = newInstance(Class.forName("org.apache.html.dom.HTMLFrameElementImpl"));
        term5750773 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term5750773, term5750773.getClass(), "prefix", "");
        setField(term5750773, term5750773.getClass(), "name", "");
        HashMap term5750931 = new HashMap();
        term5750928 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        Object term5750929 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.NullElementPointer"));
        Object term5750930 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term5750929, term5750929.getClass(), "collection", null);
        setField(term5750929, term5750929.getClass(), "valuePointer", null);
        setIntField(term5750929, term5750929.getClass(), "index", 0);
        setBooleanField(term5750929, term5750929.getClass(), "attribute", false);
        setField(term5750929, term5750929.getClass(), "rootNode", null);
        setField(term5750930, term5750930.getClass(), "parent", null);
        setField(term5750930, term5750930.getClass(), "namespaceMap", term5750931);
        setField(term5750930, term5750930.getClass(), "reverseMap", null);
        setField(term5750930, term5750930.getClass(), "pointer", null);
        setBooleanField(term5750930, term5750930.getClass(), "sealed", false);
        setField(term5750929, term5750929.getClass(), "namespaceResolver", term5750930);
        setField(term5750929, term5750929.getClass(), "parent", null);
        setField(term5750929, term5750929.getClass(), "locale", null);
        setField(term5750928, term5750928.getClass(), "parent", term5750929);
        setField(term5750928, term5750928.getClass(), "name", null);
        setField(term5750928, term5750928.getClass(), "attributes", null);
        setIntField(term5750928, term5750928.getClass(), "position", 0);
        term5750933 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term5750933, term5750933.getClass(), "prefix", "");
        setField(term5750933, term5750933.getClass(), "name", "");
        setField(term5750933, term5750933.getClass(), "qualifiedName", null);
        term5750938 = newInstance(Class.forName("org.apache.html.dom.HTMLFrameElementImpl"));
        Object term5750939 = newInstance(Class.forName("org.apache.xerces.dom.AttributeMap"));
        setField(term5750938, term5750938.getClass(), "name", null);
        setShortField(term5750939, term5750939.getClass(), "flags", (short) 0);
        setField(term5750939, term5750939.getClass(), "nodes", null);
        setField(term5750939, term5750939.getClass(), "ownerNode", term5750938);
        setField(term5750938, term5750938.getClass(), "attributes", term5750939);
        setField(term5750938, term5750938.getClass(), "ownerDocument", null);
        setField(term5750938, term5750938.getClass(), "firstChild", null);
        setField(term5750938, term5750938.getClass(), "fNodeListCache", null);
        setField(term5750938, term5750938.getClass(), "previousSibling", null);
        setField(term5750938, term5750938.getClass(), "nextSibling", null);
        setField(term5750938, term5750938.getClass(), "ownerNode", null);
        setShortField(term5750938, term5750938.getClass(), "flags", (short) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.w3c.dom.Element");
        argTypes[1] = Class.forName("org.apache.commons.jxpath.ri.QName");
        Object[] args = new Object[2];
        args[0] = term5750699;
        args[1] = term5750773;
        Object retValue = callMethod(klass, "getAttribute", argTypes, term5750125, args);
        assertTrue(recursiveEquals(term5750125, term5750928));
        assertTrue(recursiveEquals(term5750699, term5750933));
        assertTrue(recursiveEquals(term5750773, term5750938));
        assertTrue(recursiveEquals(retValue, null));
    }

};



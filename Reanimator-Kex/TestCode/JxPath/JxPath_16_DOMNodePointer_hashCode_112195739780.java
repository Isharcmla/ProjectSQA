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
import java.util.HashMap;
import java.lang.Object;

public class DOMNodePointer_hashCode_112195739780 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3331;
     Object term12356;

    public DOMNodePointer_hashCode_112195739780() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3332 = new HashMap();
        HashMap term3366 = new HashMap();
        HashMap term3371 = new HashMap();
        HashMap term3377 = new HashMap();
        HashMap term3382 = new HashMap();
        HashMap term3388 = new HashMap();
        HashMap term3393 = new HashMap();
        HashMap term3403 = new HashMap();
        term3331 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term3361 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3362 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3363 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3364 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3401 = newInstance(Class.forName("java.lang.Object"));
        Object term3402 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term3331, term3331.getClass(), "node", null);
        setField(term3331, term3331.getClass(), "namespaces", term3332);
        setField(term3331, term3331.getClass(), "defaultNamespace", "OWKQODBLzb");
        setField(term3331, term3331.getClass(), "id", "wGmYcqUkgE");
        setField(term3364, term3364.getClass(), "parent", null);
        setField(term3364, term3364.getClass(), "namespaceMap", null);
        setField(term3364, term3364.getClass(), "reverseMap", null);
        setField(term3364, term3364.getClass(), "pointer", null);
        setBooleanField(term3364, term3364.getClass(), "sealed", false);
        setField(term3363, term3363.getClass(), "parent", term3364);
        setField(term3363, term3363.getClass(), "namespaceMap", term3366);
        setField(term3363, term3363.getClass(), "reverseMap", term3371);
        setField(term3363, term3363.getClass(), "pointer", null);
        setBooleanField(term3363, term3363.getClass(), "sealed", false);
        setField(term3362, term3362.getClass(), "parent", term3363);
        setField(term3362, term3362.getClass(), "namespaceMap", term3377);
        setField(term3362, term3362.getClass(), "reverseMap", term3382);
        setField(term3362, term3362.getClass(), "pointer", null);
        setBooleanField(term3362, term3362.getClass(), "sealed", false);
        setField(term3361, term3361.getClass(), "parent", term3362);
        setField(term3361, term3361.getClass(), "namespaceMap", term3388);
        setField(term3361, term3361.getClass(), "reverseMap", term3393);
        setField(term3361, term3361.getClass(), "pointer", null);
        setBooleanField(term3361, term3361.getClass(), "sealed", false);
        setField(term3331, term3331.getClass(), "localNamespaceResolver", term3361);
        setIntField(term3331, term3331.getClass(), "index", -1179120542);
        setBooleanField(term3331, term3331.getClass(), "attribute", true);
        setField(term3331, term3331.getClass(), "rootNode", term3401);
        setField(term3402, term3402.getClass(), "parent", null);
        setField(term3402, term3402.getClass(), "namespaceMap", term3403);
        setField(term3402, term3402.getClass(), "reverseMap", null);
        setField(term3402, term3402.getClass(), "pointer", null);
        setBooleanField(term3402, term3402.getClass(), "sealed", false);
        setField(term3331, term3331.getClass(), "namespaceResolver", term3402);
        setField(term3331, term3331.getClass(), "parent", null);
        setField(term3331, term3331.getClass(), "locale", null);
        HashMap term12357 = new HashMap();
        HashMap term12366 = new HashMap();
        HashMap term12367 = new HashMap();
        HashMap term12368 = new HashMap();
        HashMap term12369 = new HashMap();
        HashMap term12370 = new HashMap();
        HashMap term12371 = new HashMap();
        HashMap term12374 = new HashMap();
        term12356 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term12362 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term12363 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term12364 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term12365 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term12372 = newInstance(Class.forName("java.lang.Object"));
        Object term12373 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term12356, term12356.getClass(), "node", null);
        setField(term12356, term12356.getClass(), "namespaces", term12357);
        setField(term12356, term12356.getClass(), "defaultNamespace", "OWKQODBLzb");
        setField(term12356, term12356.getClass(), "id", "wGmYcqUkgE");
        setField(term12365, term12365.getClass(), "parent", null);
        setField(term12365, term12365.getClass(), "namespaceMap", null);
        setField(term12365, term12365.getClass(), "reverseMap", null);
        setField(term12365, term12365.getClass(), "pointer", null);
        setBooleanField(term12365, term12365.getClass(), "sealed", false);
        setField(term12364, term12364.getClass(), "parent", term12365);
        setField(term12364, term12364.getClass(), "namespaceMap", term12366);
        setField(term12364, term12364.getClass(), "reverseMap", term12367);
        setField(term12364, term12364.getClass(), "pointer", null);
        setBooleanField(term12364, term12364.getClass(), "sealed", false);
        setField(term12363, term12363.getClass(), "parent", term12364);
        setField(term12363, term12363.getClass(), "namespaceMap", term12368);
        setField(term12363, term12363.getClass(), "reverseMap", term12369);
        setField(term12363, term12363.getClass(), "pointer", null);
        setBooleanField(term12363, term12363.getClass(), "sealed", false);
        setField(term12362, term12362.getClass(), "parent", term12363);
        setField(term12362, term12362.getClass(), "namespaceMap", term12370);
        setField(term12362, term12362.getClass(), "reverseMap", term12371);
        setField(term12362, term12362.getClass(), "pointer", null);
        setBooleanField(term12362, term12362.getClass(), "sealed", false);
        setField(term12356, term12356.getClass(), "localNamespaceResolver", term12362);
        setIntField(term12356, term12356.getClass(), "index", -1179120542);
        setBooleanField(term12356, term12356.getClass(), "attribute", true);
        setField(term12356, term12356.getClass(), "rootNode", term12372);
        setField(term12373, term12373.getClass(), "parent", null);
        setField(term12373, term12373.getClass(), "namespaceMap", term12374);
        setField(term12373, term12373.getClass(), "reverseMap", null);
        setField(term12373, term12373.getClass(), "pointer", null);
        setBooleanField(term12373, term12373.getClass(), "sealed", false);
        setField(term12356, term12356.getClass(), "namespaceResolver", term12373);
        setField(term12356, term12356.getClass(), "parent", null);
        setField(term12356, term12356.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term3331, args);
        assertTrue(recursiveEquals(term3331, term12356));
        assertTrue(recursiveEquals(retValue, 0));
    }

};



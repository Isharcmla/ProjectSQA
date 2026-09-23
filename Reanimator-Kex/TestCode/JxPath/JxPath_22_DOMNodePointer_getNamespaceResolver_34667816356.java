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

public class DOMNodePointer_getNamespaceResolver_34667816356 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term908;
     Object term6721;
     Object term6639;

    public DOMNodePointer_getNamespaceResolver_34667816356() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term909 = new HashMap();
        HashMap term943 = new HashMap();
        HashMap term948 = new HashMap();
        HashMap term954 = new HashMap();
        HashMap term959 = new HashMap();
        HashMap term965 = new HashMap();
        HashMap term970 = new HashMap();
        HashMap term979 = new HashMap();
        HashMap term984 = new HashMap();
        term908 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term938 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term939 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term940 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term941 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term978 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term908, term908.getClass(), "node", null);
        setField(term908, term908.getClass(), "namespaces", term909);
        setField(term908, term908.getClass(), "defaultNamespace", "RkybSrpybU");
        setField(term908, term908.getClass(), "id", "xOEqzGAmDU");
        setField(term941, term941.getClass(), "parent", null);
        setField(term941, term941.getClass(), "namespaceMap", null);
        setField(term941, term941.getClass(), "reverseMap", null);
        setField(term941, term941.getClass(), "pointer", null);
        setBooleanField(term941, term941.getClass(), "sealed", false);
        setField(term940, term940.getClass(), "parent", term941);
        setField(term940, term940.getClass(), "namespaceMap", term943);
        setField(term940, term940.getClass(), "reverseMap", term948);
        setField(term940, term940.getClass(), "pointer", null);
        setBooleanField(term940, term940.getClass(), "sealed", false);
        setField(term939, term939.getClass(), "parent", term940);
        setField(term939, term939.getClass(), "namespaceMap", term954);
        setField(term939, term939.getClass(), "reverseMap", term959);
        setField(term939, term939.getClass(), "pointer", null);
        setBooleanField(term939, term939.getClass(), "sealed", false);
        setField(term938, term938.getClass(), "parent", term939);
        setField(term938, term938.getClass(), "namespaceMap", term965);
        setField(term938, term938.getClass(), "reverseMap", term970);
        setField(term938, term938.getClass(), "pointer", null);
        setBooleanField(term938, term938.getClass(), "sealed", false);
        setField(term908, term908.getClass(), "localNamespaceResolver", term938);
        setIntField(term908, term908.getClass(), "index", -2038273078);
        setBooleanField(term908, term908.getClass(), "attribute", false);
        setField(term978, term978.getClass(), "parent", null);
        setField(term978, term978.getClass(), "namespaceMap", term979);
        setField(term978, term978.getClass(), "reverseMap", term984);
        setField(term978, term978.getClass(), "pointer", null);
        setBooleanField(term978, term978.getClass(), "sealed", false);
        setField(term908, term908.getClass(), "namespaceResolver", term978);
        setField(term908, term908.getClass(), "exceptionHandler", null);
        setField(term908, term908.getClass(), "rootNode", null);
        setField(term908, term908.getClass(), "parent", null);
        setField(term908, term908.getClass(), "locale", null);
        HashMap term6722 = new HashMap();
        HashMap term6731 = new HashMap();
        HashMap term6732 = new HashMap();
        HashMap term6733 = new HashMap();
        HashMap term6734 = new HashMap();
        HashMap term6735 = new HashMap();
        HashMap term6736 = new HashMap();
        HashMap term6738 = new HashMap();
        HashMap term6739 = new HashMap();
        term6721 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term6727 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term6728 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term6729 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term6730 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term6737 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term6721, term6721.getClass(), "node", null);
        setField(term6721, term6721.getClass(), "namespaces", term6722);
        setField(term6721, term6721.getClass(), "defaultNamespace", "RkybSrpybU");
        setField(term6721, term6721.getClass(), "id", "xOEqzGAmDU");
        setField(term6730, term6730.getClass(), "parent", null);
        setField(term6730, term6730.getClass(), "namespaceMap", null);
        setField(term6730, term6730.getClass(), "reverseMap", null);
        setField(term6730, term6730.getClass(), "pointer", null);
        setBooleanField(term6730, term6730.getClass(), "sealed", false);
        setField(term6729, term6729.getClass(), "parent", term6730);
        setField(term6729, term6729.getClass(), "namespaceMap", term6731);
        setField(term6729, term6729.getClass(), "reverseMap", term6732);
        setField(term6729, term6729.getClass(), "pointer", null);
        setBooleanField(term6729, term6729.getClass(), "sealed", false);
        setField(term6728, term6728.getClass(), "parent", term6729);
        setField(term6728, term6728.getClass(), "namespaceMap", term6733);
        setField(term6728, term6728.getClass(), "reverseMap", term6734);
        setField(term6728, term6728.getClass(), "pointer", null);
        setBooleanField(term6728, term6728.getClass(), "sealed", false);
        setField(term6727, term6727.getClass(), "parent", term6728);
        setField(term6727, term6727.getClass(), "namespaceMap", term6735);
        setField(term6727, term6727.getClass(), "reverseMap", term6736);
        setField(term6727, term6727.getClass(), "pointer", null);
        setBooleanField(term6727, term6727.getClass(), "sealed", false);
        setField(term6721, term6721.getClass(), "localNamespaceResolver", term6727);
        setIntField(term6721, term6721.getClass(), "index", -2038273078);
        setBooleanField(term6721, term6721.getClass(), "attribute", false);
        setField(term6737, term6737.getClass(), "parent", null);
        setField(term6737, term6737.getClass(), "namespaceMap", term6738);
        setField(term6737, term6737.getClass(), "reverseMap", term6739);
        setField(term6737, term6737.getClass(), "pointer", null);
        setBooleanField(term6737, term6737.getClass(), "sealed", false);
        setField(term6721, term6721.getClass(), "namespaceResolver", term6737);
        setField(term6721, term6721.getClass(), "exceptionHandler", null);
        setField(term6721, term6721.getClass(), "rootNode", null);
        setField(term6721, term6721.getClass(), "parent", null);
        setField(term6721, term6721.getClass(), "locale", null);
        HashMap term6644 = new HashMap();
        HashMap term6649 = new HashMap();
        HashMap term6655 = new HashMap();
        HashMap term6660 = new HashMap();
        HashMap term6666 = new HashMap();
        HashMap term6671 = new HashMap();
        term6639 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term6640 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term6641 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term6642 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term6642, term6642.getClass(), "parent", null);
        setField(term6642, term6642.getClass(), "namespaceMap", null);
        setField(term6642, term6642.getClass(), "reverseMap", null);
        setField(term6642, term6642.getClass(), "pointer", null);
        setBooleanField(term6642, term6642.getClass(), "sealed", false);
        setField(term6641, term6641.getClass(), "parent", term6642);
        setField(term6641, term6641.getClass(), "namespaceMap", term6644);
        setField(term6641, term6641.getClass(), "reverseMap", term6649);
        setField(term6641, term6641.getClass(), "pointer", null);
        setBooleanField(term6641, term6641.getClass(), "sealed", false);
        setField(term6640, term6640.getClass(), "parent", term6641);
        setField(term6640, term6640.getClass(), "namespaceMap", term6655);
        setField(term6640, term6640.getClass(), "reverseMap", term6660);
        setField(term6640, term6640.getClass(), "pointer", null);
        setBooleanField(term6640, term6640.getClass(), "sealed", false);
        setField(term6639, term6639.getClass(), "parent", term6640);
        setField(term6639, term6639.getClass(), "namespaceMap", term6666);
        setField(term6639, term6639.getClass(), "reverseMap", term6671);
        setField(term6639, term6639.getClass(), "pointer", null);
        setBooleanField(term6639, term6639.getClass(), "sealed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getNamespaceResolver", argTypes, term908, args);
        assertTrue(recursiveEquals(term908, term6721));
        assertTrue(recursiveEquals(retValue, term6639));
    }

};



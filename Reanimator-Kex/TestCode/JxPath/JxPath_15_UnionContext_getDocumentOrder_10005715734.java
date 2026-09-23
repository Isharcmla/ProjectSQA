package org.apache.commons.jxpath.ri.axes;

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
import static org.apache.commons.jxpath.ri.axes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.jxpath.ri.axes.EqualityUtils.*;
import java.lang.Object;
import java.util.HashMap;

public class UnionContext_getDocumentOrder_10005715734 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2;
     Object term124;

    public UnionContext_getDocumentOrder_10005715734() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term11 = new HashMap();
        HashMap term16 = new HashMap();
        term2 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object[] term3 = (Object[]) newArray("org.apache.commons.jxpath.ri.EvalContext", 4);
        Object term6 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.RootContext"));
        Object term7 = newInstance(Class.forName("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        Object term8 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term9 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term2, term2.getClass(), "contexts", term3);
        setBooleanField(term2, term2.getClass(), "prepared", false);
        setBooleanField(term2, term2.getClass(), "startedSet", false);
        setField(term2, term2.getClass(), "nodeSet", null);
        setField(term2, term2.getClass(), "parentContext", null);
        setField(term7, term7.getClass(), "rootPointer", null);
        setField(term7, term7.getClass(), "contextPointer", null);
        setField(term9, term9.getClass(), "parent", null);
        setField(term9, term9.getClass(), "namespaceMap", null);
        setField(term9, term9.getClass(), "reverseMap", null);
        setField(term9, term9.getClass(), "pointer", null);
        setBooleanField(term9, term9.getClass(), "sealed", false);
        setField(term8, term8.getClass(), "parent", term9);
        setField(term8, term8.getClass(), "namespaceMap", term11);
        setField(term8, term8.getClass(), "reverseMap", term16);
        setField(term8, term8.getClass(), "pointer", null);
        setBooleanField(term8, term8.getClass(), "sealed", false);
        setField(term7, term7.getClass(), "namespaceResolver", term8);
        setField(term7, term7.getClass(), "parentContext", null);
        setField(term7, term7.getClass(), "contextBean", null);
        setField(term7, term7.getClass(), "vars", null);
        setField(term7, term7.getClass(), "functions", null);
        setField(term7, term7.getClass(), "factory", null);
        setField(term7, term7.getClass(), "locale", null);
        setBooleanField(term7, term7.getClass(), "lenientSet", false);
        setBooleanField(term7, term7.getClass(), "lenient", false);
        setField(term7, term7.getClass(), "idManager", null);
        setField(term7, term7.getClass(), "keyManager", null);
        setField(term7, term7.getClass(), "decimalFormats", null);
        setField(term6, term6.getClass(), "jxpathContext", term7);
        setField(term6, term6.getClass(), "pointer", null);
        setField(term6, term6.getClass(), "registers", null);
        setIntField(term6, term6.getClass(), "availableRegister", 0);
        setField(term6, term6.getClass(), "parentContext", null);
        setField(term6, term6.getClass(), "rootContext", null);
        setIntField(term6, term6.getClass(), "position", 0);
        setBooleanField(term6, term6.getClass(), "startedSetIteration", false);
        setBooleanField(term6, term6.getClass(), "done", false);
        setBooleanField(term6, term6.getClass(), "hasPerformedIteratorStep", false);
        setField(term6, term6.getClass(), "pointerIterator", null);
        setField(term2, term2.getClass(), "rootContext", term6);
        setIntField(term2, term2.getClass(), "position", 1162663216);
        setBooleanField(term2, term2.getClass(), "startedSetIteration", false);
        setBooleanField(term2, term2.getClass(), "done", false);
        setBooleanField(term2, term2.getClass(), "hasPerformedIteratorStep", true);
        setField(term2, term2.getClass(), "pointerIterator", null);
        HashMap term130 = new HashMap();
        HashMap term131 = new HashMap();
        term124 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object[] term125 = (Object[]) newArray("org.apache.commons.jxpath.ri.EvalContext", 4);
        Object term126 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.RootContext"));
        Object term127 = newInstance(Class.forName("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        Object term128 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term129 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term124, term124.getClass(), "contexts", term125);
        setBooleanField(term124, term124.getClass(), "prepared", false);
        setBooleanField(term124, term124.getClass(), "startedSet", false);
        setField(term124, term124.getClass(), "nodeSet", null);
        setField(term124, term124.getClass(), "parentContext", null);
        setField(term127, term127.getClass(), "rootPointer", null);
        setField(term127, term127.getClass(), "contextPointer", null);
        setField(term129, term129.getClass(), "parent", null);
        setField(term129, term129.getClass(), "namespaceMap", null);
        setField(term129, term129.getClass(), "reverseMap", null);
        setField(term129, term129.getClass(), "pointer", null);
        setBooleanField(term129, term129.getClass(), "sealed", false);
        setField(term128, term128.getClass(), "parent", term129);
        setField(term128, term128.getClass(), "namespaceMap", term130);
        setField(term128, term128.getClass(), "reverseMap", term131);
        setField(term128, term128.getClass(), "pointer", null);
        setBooleanField(term128, term128.getClass(), "sealed", false);
        setField(term127, term127.getClass(), "namespaceResolver", term128);
        setField(term127, term127.getClass(), "parentContext", null);
        setField(term127, term127.getClass(), "contextBean", null);
        setField(term127, term127.getClass(), "vars", null);
        setField(term127, term127.getClass(), "functions", null);
        setField(term127, term127.getClass(), "factory", null);
        setField(term127, term127.getClass(), "locale", null);
        setBooleanField(term127, term127.getClass(), "lenientSet", false);
        setBooleanField(term127, term127.getClass(), "lenient", false);
        setField(term127, term127.getClass(), "idManager", null);
        setField(term127, term127.getClass(), "keyManager", null);
        setField(term127, term127.getClass(), "decimalFormats", null);
        setField(term126, term126.getClass(), "jxpathContext", term127);
        setField(term126, term126.getClass(), "pointer", null);
        setField(term126, term126.getClass(), "registers", null);
        setIntField(term126, term126.getClass(), "availableRegister", 0);
        setField(term126, term126.getClass(), "parentContext", null);
        setField(term126, term126.getClass(), "rootContext", null);
        setIntField(term126, term126.getClass(), "position", 0);
        setBooleanField(term126, term126.getClass(), "startedSetIteration", false);
        setBooleanField(term126, term126.getClass(), "done", false);
        setBooleanField(term126, term126.getClass(), "hasPerformedIteratorStep", false);
        setField(term126, term126.getClass(), "pointerIterator", null);
        setField(term124, term124.getClass(), "rootContext", term126);
        setIntField(term124, term124.getClass(), "position", 1162663216);
        setBooleanField(term124, term124.getClass(), "startedSetIteration", false);
        setBooleanField(term124, term124.getClass(), "done", false);
        setBooleanField(term124, term124.getClass(), "hasPerformedIteratorStep", true);
        setField(term124, term124.getClass(), "pointerIterator", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getDocumentOrder", argTypes, term2, args);
        assertTrue(recursiveEquals(term2, term124));
        assertTrue(recursiveEquals(retValue, 1));
    }

};



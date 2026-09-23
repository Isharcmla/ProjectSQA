package org.apache.commons.jxpath.ri.model.jdom;

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
import static org.apache.commons.jxpath.ri.model.jdom.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.jxpath.ri.model.jdom.EqualityUtils.*;
import java.lang.Object;
import java.util.HashMap;

public class JDOMNodePointer_getBaseValue_148194603155 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term944;
     Object term5862;
     Object term5776;

    public JDOMNodePointer_getBaseValue_148194603155() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term963 = new HashMap();
        HashMap term968 = new HashMap();
        HashMap term974 = new HashMap();
        HashMap term979 = new HashMap();
        HashMap term985 = new HashMap();
        HashMap term990 = new HashMap();
        HashMap term1002 = new HashMap();
        HashMap term1008 = new HashMap();
        HashMap term1013 = new HashMap();
        HashMap term1019 = new HashMap();
        HashMap term1024 = new HashMap();
        term944 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term945 = newInstance(Class.forName("java.lang.Object"));
        Object term958 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term959 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term960 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term961 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term998 = newInstance(Class.forName("java.lang.Object"));
        Object term999 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1000 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1001 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term944, term944.getClass(), "node", term945);
        setField(term944, term944.getClass(), "id", "oVcInYnLWB");
        setField(term961, term961.getClass(), "parent", null);
        setField(term961, term961.getClass(), "namespaceMap", null);
        setField(term961, term961.getClass(), "reverseMap", null);
        setField(term961, term961.getClass(), "pointer", null);
        setBooleanField(term961, term961.getClass(), "sealed", false);
        setField(term960, term960.getClass(), "parent", term961);
        setField(term960, term960.getClass(), "namespaceMap", term963);
        setField(term960, term960.getClass(), "reverseMap", term968);
        setField(term960, term960.getClass(), "pointer", null);
        setBooleanField(term960, term960.getClass(), "sealed", false);
        setField(term959, term959.getClass(), "parent", term960);
        setField(term959, term959.getClass(), "namespaceMap", term974);
        setField(term959, term959.getClass(), "reverseMap", term979);
        setField(term959, term959.getClass(), "pointer", null);
        setBooleanField(term959, term959.getClass(), "sealed", false);
        setField(term958, term958.getClass(), "parent", term959);
        setField(term958, term958.getClass(), "namespaceMap", term985);
        setField(term958, term958.getClass(), "reverseMap", term990);
        setField(term958, term958.getClass(), "pointer", null);
        setBooleanField(term958, term958.getClass(), "sealed", false);
        setField(term944, term944.getClass(), "localNamespaceResolver", term958);
        setIntField(term944, term944.getClass(), "index", 1227103734);
        setBooleanField(term944, term944.getClass(), "attribute", true);
        setField(term944, term944.getClass(), "rootNode", term998);
        setField(term1001, term1001.getClass(), "parent", null);
        setField(term1001, term1001.getClass(), "namespaceMap", term1002);
        setField(term1001, term1001.getClass(), "reverseMap", null);
        setField(term1001, term1001.getClass(), "pointer", null);
        setBooleanField(term1001, term1001.getClass(), "sealed", false);
        setField(term1000, term1000.getClass(), "parent", term1001);
        setField(term1000, term1000.getClass(), "namespaceMap", term1008);
        setField(term1000, term1000.getClass(), "reverseMap", term1013);
        setField(term1000, term1000.getClass(), "pointer", null);
        setBooleanField(term1000, term1000.getClass(), "sealed", false);
        setField(term999, term999.getClass(), "parent", term1000);
        setField(term999, term999.getClass(), "namespaceMap", term1019);
        setField(term999, term999.getClass(), "reverseMap", term1024);
        setField(term999, term999.getClass(), "pointer", null);
        setBooleanField(term999, term999.getClass(), "sealed", false);
        setField(term944, term944.getClass(), "namespaceResolver", term999);
        setField(term944, term944.getClass(), "parent", null);
        setField(term944, term944.getClass(), "locale", null);
        HashMap term5870 = new HashMap();
        HashMap term5871 = new HashMap();
        HashMap term5872 = new HashMap();
        HashMap term5873 = new HashMap();
        HashMap term5874 = new HashMap();
        HashMap term5875 = new HashMap();
        HashMap term5880 = new HashMap();
        HashMap term5881 = new HashMap();
        HashMap term5882 = new HashMap();
        HashMap term5883 = new HashMap();
        HashMap term5884 = new HashMap();
        term5862 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term5863 = newInstance(Class.forName("java.lang.Object"));
        Object term5866 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term5867 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term5868 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term5869 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term5876 = newInstance(Class.forName("java.lang.Object"));
        Object term5877 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term5878 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term5879 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term5862, term5862.getClass(), "node", term5863);
        setField(term5862, term5862.getClass(), "id", "oVcInYnLWB");
        setField(term5869, term5869.getClass(), "parent", null);
        setField(term5869, term5869.getClass(), "namespaceMap", null);
        setField(term5869, term5869.getClass(), "reverseMap", null);
        setField(term5869, term5869.getClass(), "pointer", null);
        setBooleanField(term5869, term5869.getClass(), "sealed", false);
        setField(term5868, term5868.getClass(), "parent", term5869);
        setField(term5868, term5868.getClass(), "namespaceMap", term5870);
        setField(term5868, term5868.getClass(), "reverseMap", term5871);
        setField(term5868, term5868.getClass(), "pointer", null);
        setBooleanField(term5868, term5868.getClass(), "sealed", false);
        setField(term5867, term5867.getClass(), "parent", term5868);
        setField(term5867, term5867.getClass(), "namespaceMap", term5872);
        setField(term5867, term5867.getClass(), "reverseMap", term5873);
        setField(term5867, term5867.getClass(), "pointer", null);
        setBooleanField(term5867, term5867.getClass(), "sealed", false);
        setField(term5866, term5866.getClass(), "parent", term5867);
        setField(term5866, term5866.getClass(), "namespaceMap", term5874);
        setField(term5866, term5866.getClass(), "reverseMap", term5875);
        setField(term5866, term5866.getClass(), "pointer", null);
        setBooleanField(term5866, term5866.getClass(), "sealed", false);
        setField(term5862, term5862.getClass(), "localNamespaceResolver", term5866);
        setIntField(term5862, term5862.getClass(), "index", 1227103734);
        setBooleanField(term5862, term5862.getClass(), "attribute", true);
        setField(term5862, term5862.getClass(), "rootNode", term5876);
        setField(term5879, term5879.getClass(), "parent", null);
        setField(term5879, term5879.getClass(), "namespaceMap", term5880);
        setField(term5879, term5879.getClass(), "reverseMap", null);
        setField(term5879, term5879.getClass(), "pointer", null);
        setBooleanField(term5879, term5879.getClass(), "sealed", false);
        setField(term5878, term5878.getClass(), "parent", term5879);
        setField(term5878, term5878.getClass(), "namespaceMap", term5881);
        setField(term5878, term5878.getClass(), "reverseMap", term5882);
        setField(term5878, term5878.getClass(), "pointer", null);
        setBooleanField(term5878, term5878.getClass(), "sealed", false);
        setField(term5877, term5877.getClass(), "parent", term5878);
        setField(term5877, term5877.getClass(), "namespaceMap", term5883);
        setField(term5877, term5877.getClass(), "reverseMap", term5884);
        setField(term5877, term5877.getClass(), "pointer", null);
        setBooleanField(term5877, term5877.getClass(), "sealed", false);
        setField(term5862, term5862.getClass(), "namespaceResolver", term5877);
        setField(term5862, term5862.getClass(), "parent", null);
        setField(term5862, term5862.getClass(), "locale", null);
        term5776 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getBaseValue", argTypes, term944, args);
        assertTrue(recursiveEquals(term944, term5862));
        assertTrue(recursiveEquals(retValue, term5776));
    }

};



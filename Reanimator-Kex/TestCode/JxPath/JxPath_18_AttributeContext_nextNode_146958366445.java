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

public class AttributeContext_nextNode_146958366445 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15565;
     Object term16856;

    public AttributeContext_nextNode_146958366445() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15565 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.AttributeContext"));
        Object term15671 = newInstance(Class.forName("org.apache.commons.jxpath.ri.compiler.NodeNameTest"));
        Object term15745 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        Object term15851 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.NamespaceContext"));
        Object term15979 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.container.ContainerPointer"));
        setIntField(term15565, term15565.getClass(), "position", 0);
        setBooleanField(term15565, term15565.getClass(), "setStarted", false);
        setField(term15745, term15745.getClass(), "prefix", null);
        setField(term15745, term15745.getClass(), "name", null);
        setField(term15671, term15671.getClass(), "qname", term15745);
        setField(term15565, term15565.getClass(), "nodeTest", term15671);
        setField(term15979, term15979.getClass(), "valuePointer", null);
        setField(term15979, term15979.getClass(), "container", null);
        setIntField(term15979, term15979.getClass(), "index", 0);
        setField(term15851, term15851.getClass(), "currentNodePointer", term15979);
        setField(term15565, term15565.getClass(), "parentContext", term15851);
        Object[] term15455 = (Object[]) newArray("org.apache.commons.jxpath.ri.model.NodePointerFactory", 4);
        Object term16115 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.CollectionPointerFactory"));
        Object term16233 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMPointerFactory"));
        Object term16355 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory"));
        Object term16479 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory"));
        setElement(term15455, 0, term16115);
        setElement(term15455, 1, term16233);
        setElement(term15455, 2, term16355);
        setElement(term15455, 3, term16479);
        setField(null, Class.forName("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"), "nodeFactoryArray", term15455);
        term16856 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.AttributeContext"));
        Object term16857 = newInstance(Class.forName("org.apache.commons.jxpath.ri.compiler.NodeNameTest"));
        Object term16858 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        Object term16859 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator"));
        Object term16860 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.NullPointer"));
        Object term16861 = newInstance(Class.forName("java.lang.Object"));
        Object term16862 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.container.ContainerPointer"));
        Object term16863 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        Object term16866 = newInstance(Class.forName("java.lang.Object"));
        Object term16867 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.NullPointer"));
        Object term16868 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.container.ContainerPointer"));
        Object term16869 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.NamespaceContext"));
        setField(term16858, term16858.getClass(), "prefix", null);
        setField(term16858, term16858.getClass(), "name", null);
        setField(term16858, term16858.getClass(), "qualifiedName", null);
        setField(term16857, term16857.getClass(), "qname", term16858);
        setField(term16857, term16857.getClass(), "namespaceURI", null);
        setField(term16856, term16856.getClass(), "nodeTest", term16857);
        setBooleanField(term16856, term16856.getClass(), "setStarted", true);
        setField(term16860, term16860.getClass(), "name", null);
        setField(term16860, term16860.getClass(), "id", null);
        setField(term16860, term16860.getClass(), "value", term16861);
        setIntField(term16860, term16860.getClass(), "index", -2147483648);
        setBooleanField(term16860, term16860.getClass(), "attribute", false);
        setField(term16860, term16860.getClass(), "rootNode", null);
        setField(term16860, term16860.getClass(), "namespaceResolver", null);
        setField(term16862, term16862.getClass(), "container", null);
        setField(term16862, term16862.getClass(), "valuePointer", term16860);
        setIntField(term16862, term16862.getClass(), "index", 0);
        setBooleanField(term16862, term16862.getClass(), "attribute", false);
        setField(term16862, term16862.getClass(), "rootNode", null);
        setField(term16862, term16862.getClass(), "namespaceResolver", null);
        setField(term16862, term16862.getClass(), "parent", null);
        setField(term16862, term16862.getClass(), "locale", null);
        setField(term16860, term16860.getClass(), "parent", term16862);
        setField(term16860, term16860.getClass(), "locale", null);
        setField(term16859, term16859.getClass(), "parent", term16860);
        setIntField(term16859, term16859.getClass(), "position", 1);
        setBooleanField(term16859, term16859.getClass(), "includeXmlLang", false);
        setBooleanField(term16859, term16859.getClass(), "empty", false);
        setBooleanField(term16859, term16859.getClass(), "reverse", false);
        setField(term16859, term16859.getClass(), "name", null);
        setIntField(term16859, term16859.getClass(), "startIndex", 0);
        setBooleanField(term16859, term16859.getClass(), "targetReady", false);
        setField(term16863, term16863.getClass(), "propertyName", "*");
        setBooleanField(term16863, term16863.getClass(), "byNameAttribute", false);
        setIntField(term16863, term16863.getClass(), "propertyIndex", -2147483648);
        setField(term16863, term16863.getClass(), "bean", null);
        setField(term16863, term16863.getClass(), "value", term16866);
        setIntField(term16863, term16863.getClass(), "index", -2147483648);
        setBooleanField(term16863, term16863.getClass(), "attribute", false);
        setField(term16863, term16863.getClass(), "rootNode", null);
        setField(term16863, term16863.getClass(), "namespaceResolver", null);
        setField(term16867, term16867.getClass(), "name", null);
        setField(term16867, term16867.getClass(), "id", null);
        setField(term16867, term16867.getClass(), "value", term16861);
        setIntField(term16867, term16867.getClass(), "index", -2147483648);
        setBooleanField(term16867, term16867.getClass(), "attribute", false);
        setField(term16867, term16867.getClass(), "rootNode", null);
        setField(term16867, term16867.getClass(), "namespaceResolver", null);
        setField(term16868, term16868.getClass(), "container", null);
        setField(term16868, term16868.getClass(), "valuePointer", term16860);
        setIntField(term16868, term16868.getClass(), "index", 0);
        setBooleanField(term16868, term16868.getClass(), "attribute", false);
        setField(term16868, term16868.getClass(), "rootNode", null);
        setField(term16868, term16868.getClass(), "namespaceResolver", null);
        setField(term16868, term16868.getClass(), "parent", null);
        setField(term16868, term16868.getClass(), "locale", null);
        setField(term16867, term16867.getClass(), "parent", term16868);
        setField(term16867, term16867.getClass(), "locale", null);
        setField(term16863, term16863.getClass(), "parent", term16867);
        setField(term16863, term16863.getClass(), "locale", null);
        setField(term16859, term16859.getClass(), "propertyNodePointer", term16863);
        setIntField(term16859, term16859.getClass(), "startPropertyIndex", 0);
        setBooleanField(term16859, term16859.getClass(), "includeStart", true);
        setField(term16856, term16856.getClass(), "iterator", term16859);
        setField(term16856, term16856.getClass(), "currentNodePointer", null);
        setField(term16869, term16869.getClass(), "nodeTest", null);
        setBooleanField(term16869, term16869.getClass(), "setStarted", false);
        setField(term16869, term16869.getClass(), "iterator", null);
        setField(term16869, term16869.getClass(), "currentNodePointer", term16862);
        setField(term16869, term16869.getClass(), "parentContext", null);
        setField(term16869, term16869.getClass(), "rootContext", null);
        setIntField(term16869, term16869.getClass(), "position", 0);
        setBooleanField(term16869, term16869.getClass(), "startedSetIteration", false);
        setBooleanField(term16869, term16869.getClass(), "done", false);
        setBooleanField(term16869, term16869.getClass(), "hasPerformedIteratorStep", false);
        setField(term16869, term16869.getClass(), "pointerIterator", null);
        setField(term16856, term16856.getClass(), "parentContext", term16869);
        setField(term16856, term16856.getClass(), "rootContext", null);
        setIntField(term16856, term16856.getClass(), "position", 1);
        setBooleanField(term16856, term16856.getClass(), "startedSetIteration", false);
        setBooleanField(term16856, term16856.getClass(), "done", false);
        setBooleanField(term16856, term16856.getClass(), "hasPerformedIteratorStep", false);
        setField(term16856, term16856.getClass(), "pointerIterator", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.axes.AttributeContext");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "nextNode", argTypes, term15565, args);
        assertTrue(recursiveEquals(term15565, term16856));
        assertTrue(recursiveEquals(retValue, false));
    }

};



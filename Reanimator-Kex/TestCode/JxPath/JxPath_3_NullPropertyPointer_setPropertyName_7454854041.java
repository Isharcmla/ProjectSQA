package org.apache.commons.jxpath.ri.model.beans;

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
import static org.apache.commons.jxpath.ri.model.beans.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.jxpath.ri.model.beans.EqualityUtils.*;
import java.lang.Object;
import java.util.HashMap;

public class NullPropertyPointer_setPropertyName_7454854041 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1188;
     Object term4393;

    public NullPropertyPointer_setPropertyName_7454854041() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1213 = new HashMap();
        HashMap term1218 = new HashMap();
        HashMap term1224 = new HashMap();
        HashMap term1229 = new HashMap();
        HashMap term1235 = new HashMap();
        HashMap term1240 = new HashMap();
        term1188 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        Object term1203 = newInstance(Class.forName("java.lang.Object"));
        Object term1204 = newInstance(Class.forName("java.lang.Object"));
        Object term1207 = newInstance(Class.forName("java.lang.Object"));
        Object term1208 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1209 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1210 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1211 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term1188, term1188.getClass(), "propertyName", "hNxWaHcfhY");
        setBooleanField(term1188, term1188.getClass(), "byNameAttribute", true);
        setIntField(term1188, term1188.getClass(), "propertyIndex", -1087774327);
        setField(term1188, term1188.getClass(), "bean", term1203);
        setField(term1188, term1188.getClass(), "value", term1204);
        setIntField(term1188, term1188.getClass(), "index", -1530420153);
        setBooleanField(term1188, term1188.getClass(), "attribute", true);
        setField(term1188, term1188.getClass(), "rootNode", term1207);
        setField(term1211, term1211.getClass(), "parent", null);
        setField(term1211, term1211.getClass(), "namespaceMap", null);
        setField(term1211, term1211.getClass(), "reverseMap", null);
        setField(term1211, term1211.getClass(), "pointer", null);
        setField(term1211, term1211.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term1211, term1211.getClass(), "sealed", false);
        setField(term1210, term1210.getClass(), "parent", term1211);
        setField(term1210, term1210.getClass(), "namespaceMap", term1213);
        setField(term1210, term1210.getClass(), "reverseMap", term1218);
        setField(term1210, term1210.getClass(), "pointer", null);
        setField(term1210, term1210.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term1210, term1210.getClass(), "sealed", false);
        setField(term1209, term1209.getClass(), "parent", term1210);
        setField(term1209, term1209.getClass(), "namespaceMap", term1224);
        setField(term1209, term1209.getClass(), "reverseMap", term1229);
        setField(term1209, term1209.getClass(), "pointer", null);
        setField(term1209, term1209.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term1209, term1209.getClass(), "sealed", false);
        setField(term1208, term1208.getClass(), "parent", term1209);
        setField(term1208, term1208.getClass(), "namespaceMap", term1235);
        setField(term1208, term1208.getClass(), "reverseMap", term1240);
        setField(term1208, term1208.getClass(), "pointer", null);
        setField(term1208, term1208.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term1208, term1208.getClass(), "sealed", false);
        setField(term1188, term1188.getClass(), "namespaceResolver", term1208);
        setField(term1188, term1188.getClass(), "parent", null);
        setField(term1188, term1188.getClass(), "locale", null);
        HashMap term4403 = new HashMap();
        HashMap term4404 = new HashMap();
        HashMap term4405 = new HashMap();
        HashMap term4406 = new HashMap();
        HashMap term4407 = new HashMap();
        HashMap term4408 = new HashMap();
        term4393 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        Object term4396 = newInstance(Class.forName("java.lang.Object"));
        Object term4397 = newInstance(Class.forName("java.lang.Object"));
        Object term4398 = newInstance(Class.forName("java.lang.Object"));
        Object term4399 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term4400 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term4401 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term4402 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term4393, term4393.getClass(), "propertyName", "RkybSrpybU");
        setBooleanField(term4393, term4393.getClass(), "byNameAttribute", true);
        setIntField(term4393, term4393.getClass(), "propertyIndex", -1087774327);
        setField(term4393, term4393.getClass(), "bean", term4396);
        setField(term4393, term4393.getClass(), "value", term4397);
        setIntField(term4393, term4393.getClass(), "index", -1530420153);
        setBooleanField(term4393, term4393.getClass(), "attribute", true);
        setField(term4393, term4393.getClass(), "rootNode", term4398);
        setField(term4402, term4402.getClass(), "parent", null);
        setField(term4402, term4402.getClass(), "namespaceMap", null);
        setField(term4402, term4402.getClass(), "reverseMap", null);
        setField(term4402, term4402.getClass(), "pointer", null);
        setField(term4402, term4402.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term4402, term4402.getClass(), "sealed", false);
        setField(term4401, term4401.getClass(), "parent", term4402);
        setField(term4401, term4401.getClass(), "namespaceMap", term4403);
        setField(term4401, term4401.getClass(), "reverseMap", term4404);
        setField(term4401, term4401.getClass(), "pointer", null);
        setField(term4401, term4401.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term4401, term4401.getClass(), "sealed", false);
        setField(term4400, term4400.getClass(), "parent", term4401);
        setField(term4400, term4400.getClass(), "namespaceMap", term4405);
        setField(term4400, term4400.getClass(), "reverseMap", term4406);
        setField(term4400, term4400.getClass(), "pointer", null);
        setField(term4400, term4400.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term4400, term4400.getClass(), "sealed", false);
        setField(term4399, term4399.getClass(), "parent", term4400);
        setField(term4399, term4399.getClass(), "namespaceMap", term4407);
        setField(term4399, term4399.getClass(), "reverseMap", term4408);
        setField(term4399, term4399.getClass(), "pointer", null);
        setField(term4399, term4399.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term4399, term4399.getClass(), "sealed", false);
        setField(term4393, term4393.getClass(), "namespaceResolver", term4399);
        setField(term4393, term4393.getClass(), "parent", null);
        setField(term4393, term4393.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "RkybSrpybU";
        callMethod(klass, "setPropertyName", argTypes, term1188, args);
        assertTrue(recursiveEquals(term1188, term4393));
    }

};



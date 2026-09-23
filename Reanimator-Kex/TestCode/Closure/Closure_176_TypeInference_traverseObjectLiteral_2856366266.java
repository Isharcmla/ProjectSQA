package com.google.javascript.jscomp;

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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class TypeInference_traverseObjectLiteral_2856366266 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5505;
     Object term5549;

    public TypeInference_traverseObjectLiteral_2856366266() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term34096 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term34095 = ((Class) term34096).getDeclaredField((String) "PUBLIC");
        ((Field) term34095).setAccessible(true);
        Object enum85 = ((Field) term34095).get((Object) null);
        term5505 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        Object term5506 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object term5507 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term5521 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term5522 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term5528 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term5529 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5535 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term5540 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateTypeMap"));
        Object term5542 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        setField(term5505, term5505.getClass(), "compiler", null);
        setField(term5507, term5507.getClass(), "name", "qnYaYSpDwO");
        setField(term5507, term5507.getClass(), "referencedType", null);
        setField(term5507, term5507.getClass(), "referencedObjType", null);
        setBooleanField(term5507, term5507.getClass(), "visited", false);
        setField(term5522, term5522.getClass(), "baseType", null);
        setField(term5522, term5522.getClass(), "extendedInterfaces", null);
        setField(term5522, term5522.getClass(), "implementedInterfaces", null);
        setField(term5522, term5522.getClass(), "parameters", null);
        setField(term5522, term5522.getClass(), "thrownTypes", null);
        setField(term5522, term5522.getClass(), "templateTypeNames", null);
        setField(term5522, term5522.getClass(), "disposedParameters", null);
        setField(term5522, term5522.getClass(), "description", null);
        setField(term5522, term5522.getClass(), "meaning", null);
        setField(term5522, term5522.getClass(), "deprecated", null);
        setField(term5522, term5522.getClass(), "license", null);
        setField(term5522, term5522.getClass(), "suppressions", null);
        setField(term5522, term5522.getClass(), "modifies", null);
        setField(term5522, term5522.getClass(), "lendsName", null);
        setBooleanField(term5522, term5522.getClass(), "ngInject", false);
        setBooleanField(term5522, term5522.getClass(), "wizaction", false);
        setBooleanField(term5522, term5522.getClass(), "jaggerInject", true);
        setBooleanField(term5522, term5522.getClass(), "jaggerProvide", false);
        setBooleanField(term5522, term5522.getClass(), "jaggerModule", false);
        setField(term5521, term5521.getClass(), "info", term5522);
        setField(term5528, term5528.getClass(), "sourceComment", null);
        setField(term5528, term5528.getClass(), "markers", null);
        setField(term5528, term5528.getClass(), "parameters", null);
        setField(term5528, term5528.getClass(), "throwsDescriptions", null);
        setField(term5528, term5528.getClass(), "blockDescription", null);
        setField(term5528, term5528.getClass(), "fileOverview", null);
        setField(term5528, term5528.getClass(), "returnDescription", null);
        setField(term5528, term5528.getClass(), "version", null);
        setField(term5528, term5528.getClass(), "authors", null);
        setField(term5528, term5528.getClass(), "sees", null);
        setField(term5521, term5521.getClass(), "documentation", term5528);
        setIntField(term5529, term5529.getClass(), "type", 0);
        setField(term5529, term5529.getClass(), "next", null);
        setField(term5529, term5529.getClass(), "first", null);
        setField(term5529, term5529.getClass(), "last", null);
        setField(term5529, term5529.getClass(), "propListHead", null);
        setIntField(term5529, term5529.getClass(), "sourcePosition", 0);
        setField(term5529, term5529.getClass(), "jsType", null);
        setField(term5529, term5529.getClass(), "parent", null);
        setField(term5521, term5521.getClass(), "associatedNode", term5529);
        setField(term5521, term5521.getClass(), "visibility", enum85);
        setIntField(term5521, term5521.getClass(), "bitset", -749861210);
        setField(term5535, term5535.getClass(), "root", null);
        setField(term5535, term5535.getClass(), "sourceName", null);
        setField(term5521, term5521.getClass(), "type", term5535);
        setField(term5521, term5521.getClass(), "thisType", term5535);
        setBooleanField(term5521, term5521.getClass(), "includeDocumentation", false);
        setIntField(term5521, term5521.getClass(), "originalCommentPosition", 1694224101);
        setField(term5507, term5507.getClass(), "docInfo", term5521);
        setBooleanField(term5507, term5507.getClass(), "unknown", true);
        setBooleanField(term5507, term5507.getClass(), "resolved", false);
        setField(term5507, term5507.getClass(), "resolveResult", null);
        setField(term5540, term5540.getClass(), "templateKeys", null);
        setField(term5540, term5540.getClass(), "templateValues", null);
        setField(term5540, term5540.getClass(), "resolvedTemplateValues", null);
        setField(term5540, term5540.getClass(), "registry", null);
        setField(term5507, term5507.getClass(), "templateTypeMap", term5540);
        setBooleanField(term5507, term5507.getClass(), "inTemplatedCheckVisit", false);
        setField(term5507, term5507.getClass(), "registry", null);
        setField(term5506, term5506.getClass(), "objectIndexTemplateKey", term5507);
        setField(term5542, term5542.getClass(), "name", null);
        setField(term5542, term5542.getClass(), "referencedType", null);
        setField(term5542, term5542.getClass(), "referencedObjType", null);
        setBooleanField(term5542, term5542.getClass(), "visited", false);
        setField(term5542, term5542.getClass(), "docInfo", null);
        setBooleanField(term5542, term5542.getClass(), "unknown", false);
        setBooleanField(term5542, term5542.getClass(), "resolved", false);
        setField(term5542, term5542.getClass(), "resolveResult", null);
        setField(term5542, term5542.getClass(), "templateTypeMap", null);
        setBooleanField(term5542, term5542.getClass(), "inTemplatedCheckVisit", false);
        setField(term5542, term5542.getClass(), "registry", null);
        setField(term5506, term5506.getClass(), "objectElementTemplateKey", term5542);
        setField(term5506, term5506.getClass(), "reporter", null);
        setField(term5506, term5506.getClass(), "nativeTypes", null);
        setField(term5506, term5506.getClass(), "namesToTypes", null);
        setField(term5506, term5506.getClass(), "namespaces", null);
        setField(term5506, term5506.getClass(), "nonNullableTypeNames", null);
        setField(term5506, term5506.getClass(), "forwardDeclaredTypes", null);
        setField(term5506, term5506.getClass(), "typesIndexedByProperty", null);
        setField(term5506, term5506.getClass(), "eachRefTypeIndexedByProperty", null);
        setField(term5506, term5506.getClass(), "greatestSubtypeByProperty", null);
        setField(term5506, term5506.getClass(), "interfaceToImplementors", null);
        setField(term5506, term5506.getClass(), "unresolvedNamedTypes", null);
        setField(term5506, term5506.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term5506, term5506.getClass(), "lastGeneration", false);
        setField(term5506, term5506.getClass(), "templateTypes", null);
        setField(term5506, term5506.getClass(), "emptyTemplateTypeMap", null);
        setBooleanField(term5506, term5506.getClass(), "tolerateUndefinedValues", false);
        setField(term5505, term5505.getClass(), "registry", term5506);
        setField(term5505, term5505.getClass(), "reverseInterpreter", null);
        setField(term5505, term5505.getClass(), "syntacticScope", null);
        setField(term5505, term5505.getClass(), "functionScope", null);
        setField(term5505, term5505.getClass(), "bottomScope", null);
        setField(term5505, term5505.getClass(), "assertionFunctionsMap", null);
        setField(term5505, term5505.getClass(), "unknownType", null);
        setField(term5505, term5505.getClass(), "cfg", null);
        setField(term5505, term5505.getClass(), "joinOp", null);
        setField(term5505, term5505.getClass(), "orderedWorkSet", null);
        term5549 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5551 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5553 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5555 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5557 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5560 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5564 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5566 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5571 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term5549, term5549.getClass(), "type", -916584829);
        setIntField(term5551, term5551.getClass(), "type", -2131181468);
        setIntField(term5553, term5553.getClass(), "type", 282916351);
        setIntField(term5555, term5555.getClass(), "type", 880977281);
        setIntField(term5557, term5557.getClass(), "type", 371943306);
        setField(term5557, term5557.getClass(), "next", null);
        setField(term5557, term5557.getClass(), "first", null);
        setField(term5557, term5557.getClass(), "last", null);
        setField(term5557, term5557.getClass(), "propListHead", null);
        setIntField(term5557, term5557.getClass(), "sourcePosition", 0);
        setField(term5557, term5557.getClass(), "jsType", null);
        setField(term5557, term5557.getClass(), "parent", null);
        setField(term5555, term5555.getClass(), "next", term5557);
        setIntField(term5560, term5560.getClass(), "type", 982388293);
        setField(term5560, term5560.getClass(), "next", null);
        setField(term5560, term5560.getClass(), "first", null);
        setField(term5560, term5560.getClass(), "last", term5557);
        setField(term5560, term5560.getClass(), "propListHead", null);
        setIntField(term5560, term5560.getClass(), "sourcePosition", 0);
        setField(term5560, term5560.getClass(), "jsType", null);
        setField(term5560, term5560.getClass(), "parent", null);
        setField(term5555, term5555.getClass(), "first", term5560);
        setField(term5555, term5555.getClass(), "last", term5553);
        setField(term5555, term5555.getClass(), "propListHead", null);
        setIntField(term5555, term5555.getClass(), "sourcePosition", 0);
        setField(term5555, term5555.getClass(), "jsType", null);
        setField(term5555, term5555.getClass(), "parent", null);
        setField(term5553, term5553.getClass(), "next", term5555);
        setField(term5553, term5553.getClass(), "first", term5557);
        setIntField(term5564, term5564.getClass(), "type", -75206835);
        setIntField(term5566, term5566.getClass(), "type", -1618206977);
        setField(term5566, term5566.getClass(), "next", null);
        setField(term5566, term5566.getClass(), "first", term5560);
        setField(term5566, term5566.getClass(), "last", term5555);
        setField(term5566, term5566.getClass(), "propListHead", null);
        setIntField(term5566, term5566.getClass(), "sourcePosition", 0);
        setField(term5566, term5566.getClass(), "jsType", null);
        setField(term5566, term5566.getClass(), "parent", null);
        setField(term5564, term5564.getClass(), "next", term5566);
        setField(term5564, term5564.getClass(), "first", term5551);
        setField(term5564, term5564.getClass(), "last", term5551);
        setField(term5564, term5564.getClass(), "propListHead", null);
        setIntField(term5564, term5564.getClass(), "sourcePosition", 0);
        setField(term5564, term5564.getClass(), "jsType", null);
        setField(term5564, term5564.getClass(), "parent", null);
        setField(term5553, term5553.getClass(), "last", term5564);
        setField(term5553, term5553.getClass(), "propListHead", null);
        setIntField(term5553, term5553.getClass(), "sourcePosition", 0);
        setField(term5553, term5553.getClass(), "jsType", null);
        setField(term5553, term5553.getClass(), "parent", null);
        setField(term5551, term5551.getClass(), "next", term5553);
        setIntField(term5571, term5571.getClass(), "type", -1747406163);
        setField(term5571, term5571.getClass(), "next", term5564);
        setField(term5571, term5571.getClass(), "first", term5566);
        setField(term5571, term5571.getClass(), "last", term5549);
        setField(term5571, term5571.getClass(), "propListHead", null);
        setIntField(term5571, term5571.getClass(), "sourcePosition", 0);
        setField(term5571, term5571.getClass(), "jsType", null);
        setField(term5571, term5571.getClass(), "parent", null);
        setField(term5551, term5551.getClass(), "first", term5571);
        setField(term5551, term5551.getClass(), "last", term5571);
        setField(term5551, term5551.getClass(), "propListHead", null);
        setIntField(term5551, term5551.getClass(), "sourcePosition", 0);
        setField(term5551, term5551.getClass(), "jsType", null);
        setField(term5551, term5551.getClass(), "parent", null);
        setField(term5549, term5549.getClass(), "next", term5551);
        setField(term5549, term5549.getClass(), "first", term5555);
        setField(term5549, term5549.getClass(), "last", term5557);
        setField(term5549, term5549.getClass(), "propListHead", null);
        setIntField(term5549, term5549.getClass(), "sourcePosition", 0);
        setField(term5549, term5549.getClass(), "jsType", null);
        setField(term5549, term5549.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term5549;
        args[1] = null;
        try {
            callMethod(klass, "traverseObjectLiteral", argTypes, term5505, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



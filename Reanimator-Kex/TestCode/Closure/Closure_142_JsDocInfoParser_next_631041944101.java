package com.google.javascript.jscomp.parsing;

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
import java.lang.ArrayIndexOutOfBoundsException;
import static com.google.javascript.jscomp.parsing.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.lang.String;

public class JsDocInfoParser_next_631041944101 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48865;

    public JsDocInfoParser_next_631041944101() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term48913 = new HashMap();
        HashMap term48922 = new HashMap();
        Set<Object> term339583 =  ((Map) term48922).keySet();
        HashSet term48921 = new HashSet((Collection<? extends Object>) term339583);
        HashMap term48929 = new HashMap();
        Set<Object> term339584 =  ((Map) term48929).keySet();
        HashSet term48928 = new HashSet((Collection<? extends Object>) term339584);
        HashMap term48936 = new HashMap();
        Set<Object> term339585 =  ((Map) term48936).keySet();
        HashSet term48935 = new HashSet((Collection<? extends Object>) term339585);
        HashMap term48942 = new HashMap();
        HashMap term48947 = new HashMap();
        Class<? extends Object> term339607 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term339606 = ((Class) term339607).getDeclaredField((String) "INHERITED");
        ((Field) term339606).setAccessible(true);
        Object enum266 = ((Field) term339606).get((Object) null);
        Class<? extends Object> term339891 = Class.forName((String) "com.google.javascript.jscomp.parsing.JsDocInfoParser$State");
        Field term339890 = ((Class) term339891).getDeclaredField((String) "SEARCHING_NEWLINE");
        ((Field) term339890).setAccessible(true);
        Object enum267 = ((Field) term339890).get((Object) null);
        HashMap term49038 = new HashMap();
        term48865 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser"));
        Object term48866 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocTokenStream"));
        char[] term48879 = (char[]) newCharArray(1);
        int[] term48882 = (int[]) newIntArray(3);
        Object term48911 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term48912 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 5);
        Object term48968 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term48982 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term48983 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term48984 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term48989 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term48990 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term48994 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term48995 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term49000 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$Marker"));
        Object term49013 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser$ErrorReporterParser"));
        Object term49014 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term49049 = newInstance(Class.forName("com.google.javascript.rhino.Node$FileLevelJsDocBuilder"));
        setField(term48866, term48866.getClass(), "string", "GAxMzRqmXU");
        setCharElement(term48879, 0, 'c');
        setField(term48866, term48866.getClass(), "stringBuffer", term48879);
        setIntField(term48866, term48866.getClass(), "stringBufferTop", -712023865);
        setIntElement(term48882, 0, 613256157);
        setIntElement(term48882, 1, 454242689);
        setIntElement(term48882, 2, 1798354517);
        setField(term48866, term48866.getClass(), "ungetBuffer", term48882);
        setIntField(term48866, term48866.getClass(), "ungetCursor", -1495693617);
        setBooleanField(term48866, term48866.getClass(), "hitEOF", true);
        setIntField(term48866, term48866.getClass(), "lineStart", -890538258);
        setIntField(term48866, term48866.getClass(), "lineEndChar", -1085899912);
        setIntField(term48866, term48866.getClass(), "lineno", -1458980236);
        setIntField(term48866, term48866.getClass(), "charno", 890505372);
        setIntField(term48866, term48866.getClass(), "initCharno", 2044137055);
        setIntField(term48866, term48866.getClass(), "initLineno", -1452324619);
        setField(term48866, term48866.getClass(), "sourceString", "XMhUDGKSWO");
        setIntField(term48866, term48866.getClass(), "sourceEnd", -1121709274);
        setIntField(term48866, term48866.getClass(), "sourceCursor", -532304223);
        setIntField(term48866, term48866.getClass(), "cursor", 666218293);
        setIntField(term48866, term48866.getClass(), "tokenBeg", 1737876343);
        setIntField(term48866, term48866.getClass(), "tokenEnd", -897937940);
        setField(term48865, term48865.getClass(), "stream", term48866);
        setField(term48911, term48911.getClass(), "reporter", null);
        setField(term48911, term48911.getClass(), "nativeTypes", term48912);
        setField(term48911, term48911.getClass(), "namesToTypes", term48913);
        setField(term48911, term48911.getClass(), "namespaces", term48921);
        setField(term48911, term48911.getClass(), "enumTypeNames", term48928);
        setField(term48911, term48911.getClass(), "forwardDeclaredTypes", term48935);
        setField(term48911, term48911.getClass(), "typesIndexedByProperty", term48942);
        setField(term48911, term48911.getClass(), "greatestSubtypeByProperty", term48947);
        setField(term48911, term48911.getClass(), "interfaceToImplementors", null);
        setField(term48911, term48911.getClass(), "unresolvedNamedTypes", null);
        setField(term48911, term48911.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term48911, term48911.getClass(), "lastGeneration", true);
        setField(term48911, term48911.getClass(), "templateTypeName", "URWnZtbrQH");
        setField(term48968, term48968.getClass(), "name", "hpTAdtnQku");
        setField(term48968, term48968.getClass(), "referencedType", null);
        setBooleanField(term48968, term48968.getClass(), "visited", false);
        setField(term48983, term48983.getClass(), "baseType", null);
        setField(term48983, term48983.getClass(), "implementedInterfaces", null);
        setField(term48983, term48983.getClass(), "parameters", null);
        setField(term48983, term48983.getClass(), "thrownTypes", null);
        setField(term48983, term48983.getClass(), "templateTypeName", null);
        setField(term48983, term48983.getClass(), "description", null);
        setField(term48983, term48983.getClass(), "deprecated", null);
        setField(term48983, term48983.getClass(), "license", null);
        setField(term48983, term48983.getClass(), "suppressions", null);
        setField(term48982, term48982.getClass(), "info", term48983);
        setField(term48984, term48984.getClass(), "markers", null);
        setField(term48984, term48984.getClass(), "parameters", null);
        setField(term48984, term48984.getClass(), "throwsDescriptions", null);
        setField(term48984, term48984.getClass(), "blockDescription", null);
        setField(term48984, term48984.getClass(), "fileOverview", null);
        setField(term48984, term48984.getClass(), "returnDescription", null);
        setField(term48984, term48984.getClass(), "version", null);
        setField(term48984, term48984.getClass(), "authors", null);
        setField(term48984, term48984.getClass(), "sees", null);
        setField(term48982, term48982.getClass(), "documentation", term48984);
        setField(term48982, term48982.getClass(), "sourceName", "");
        setField(term48982, term48982.getClass(), "visibility", enum266);
        setIntField(term48982, term48982.getClass(), "bitset", 1523261232);
        setField(term48989, term48989.getClass(), "root", null);
        setField(term48989, term48989.getClass(), "sourceName", null);
        setField(term48989, term48989.getClass(), "registry", null);
        setField(term48982, term48982.getClass(), "type", term48989);
        setField(term48990, term48990.getClass(), "root", null);
        setField(term48990, term48990.getClass(), "sourceName", null);
        setField(term48990, term48990.getClass(), "registry", null);
        setField(term48982, term48982.getClass(), "thisType", term48990);
        setBooleanField(term48982, term48982.getClass(), "includeDocumentation", true);
        setField(term48968, term48968.getClass(), "docInfo", term48982);
        setBooleanField(term48968, term48968.getClass(), "unknown", false);
        setBooleanField(term48968, term48968.getClass(), "resolved", true);
        setField(term48968, term48968.getClass(), "resolveResult", null);
        setField(term48968, term48968.getClass(), "registry", null);
        setField(term48911, term48911.getClass(), "templateType", term48968);
        setField(term48865, term48865.getClass(), "typeRegistry", term48911);
        setField(term48995, term48995.getClass(), "info", null);
        setField(term48995, term48995.getClass(), "documentation", null);
        setField(term48995, term48995.getClass(), "sourceName", null);
        setField(term48995, term48995.getClass(), "visibility", null);
        setIntField(term48995, term48995.getClass(), "bitset", 0);
        setField(term48995, term48995.getClass(), "type", null);
        setField(term48995, term48995.getClass(), "thisType", null);
        setBooleanField(term48995, term48995.getClass(), "includeDocumentation", false);
        setField(term48994, term48994.getClass(), "currentInfo", term48995);
        setBooleanField(term48994, term48994.getClass(), "populated", false);
        setBooleanField(term48994, term48994.getClass(), "parseDocumentation", false);
        setField(term49000, term49000.getClass(), "annotation", null);
        setField(term49000, term49000.getClass(), "name", null);
        setField(term49000, term49000.getClass(), "description", null);
        setField(term49000, term49000.getClass(), "type", null);
        setField(term48994, term48994.getClass(), "currentMarker", term49000);
        setField(term48865, term48865.getClass(), "jsdocBuilder", term48994);
        setField(term48865, term48865.getClass(), "sourceName", "feyxNWUenU");
        setField(term48865, term48865.getClass(), "errorReporter", null);
        setField(term49013, term49013.getClass(), "this$0", null);
        setField(term48865, term48865.getClass(), "parser", term49013);
        setField(term49014, term49014.getClass(), "info", null);
        setField(term49014, term49014.getClass(), "documentation", null);
        setField(term49014, term49014.getClass(), "sourceName", null);
        setField(term49014, term49014.getClass(), "visibility", null);
        setIntField(term49014, term49014.getClass(), "bitset", 0);
        setField(term49014, term49014.getClass(), "type", null);
        setField(term49014, term49014.getClass(), "thisType", null);
        setBooleanField(term49014, term49014.getClass(), "includeDocumentation", false);
        setField(term48865, term48865.getClass(), "fileOverviewJSDocInfo", term49014);
        setField(term48865, term48865.getClass(), "state", enum267);
        setField(term48865, term48865.getClass(), "annotationNames", term49038);
        setField(term49049, term49049.getClass(), "this$0", null);
        setField(term48865, term48865.getClass(), "fileLevelJsDocBuilder", term49049);
        setField(term48865, term48865.getClass(), "unreadToken", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "next", argTypes, term48865, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};



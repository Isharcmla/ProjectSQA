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
import java.util.MissingResourceException;
import static com.google.javascript.jscomp.parsing.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.lang.String;

public class IRFactory_handlePossibleFileOverviewJsDoc_48921445426 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3315;
     Object term3412;

    public IRFactory_handlePossibleFileOverviewJsDoc_48921445426() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3343 = new HashMap();
        HashMap term3352 = new HashMap();
        Set<Object> term14638 =  ((Map) term3352).keySet();
        HashSet term3351 = new HashSet((Collection<? extends Object>) term14638);
        HashMap term3362 = new HashMap();
        Set<Object> term14639 =  ((Map) term3362).keySet();
        HashSet term3361 = new HashSet((Collection<? extends Object>) term14639);
        term3315 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        Object term3340 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.Config"));
        Object term3360 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher"));
        Object term3378 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3380 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3382 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3385 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3388 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3391 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term3395 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3398 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3401 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term3405 = newInstance(Class.forName("com.google.javascript.rhino.Node$FileLevelJsDocBuilder"));
        Object term3406 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term3409 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term3315, term3315.getClass(), "sourceString", "gCWtLVKVVe");
        setField(term3315, term3315.getClass(), "sourceName", "fWKJoSoCwE");
        setBooleanField(term3340, term3340.getClass(), "parseJsDocDocumentation", false);
        setBooleanField(term3340, term3340.getClass(), "isIdeMode", false);
        setField(term3340, term3340.getClass(), "annotationNames", term3343);
        setField(term3340, term3340.getClass(), "suppressionNames", term3351);
        setBooleanField(term3340, term3340.getClass(), "acceptES5", false);
        setBooleanField(term3340, term3340.getClass(), "acceptConstKeyword", true);
        setField(term3315, term3315.getClass(), "config", term3340);
        setField(term3315, term3315.getClass(), "errorReporter", null);
        setField(term3360, term3360.getClass(), "this$0", null);
        setField(term3315, term3315.getClass(), "transformDispatcher", term3360);
        setField(term3315, term3315.getClass(), "ALLOWED_DIRECTIVES", term3361);
        setIntField(term3378, term3378.getClass(), "type", 683666002);
        setIntField(term3380, term3380.getClass(), "type", -663691365);
        setIntField(term3382, term3382.getClass(), "type", 0);
        setField(term3382, term3382.getClass(), "next", null);
        setField(term3382, term3382.getClass(), "first", null);
        setField(term3382, term3382.getClass(), "last", null);
        setField(term3382, term3382.getClass(), "propListHead", null);
        setIntField(term3382, term3382.getClass(), "sourcePosition", 0);
        setField(term3382, term3382.getClass(), "jsType", null);
        setField(term3382, term3382.getClass(), "parent", null);
        setField(term3380, term3380.getClass(), "next", term3382);
        setIntField(term3385, term3385.getClass(), "type", 0);
        setField(term3385, term3385.getClass(), "next", null);
        setField(term3385, term3385.getClass(), "first", null);
        setField(term3385, term3385.getClass(), "last", null);
        setField(term3385, term3385.getClass(), "propListHead", null);
        setIntField(term3385, term3385.getClass(), "sourcePosition", 0);
        setField(term3385, term3385.getClass(), "jsType", null);
        setField(term3385, term3385.getClass(), "parent", null);
        setField(term3380, term3380.getClass(), "first", term3385);
        setIntField(term3388, term3388.getClass(), "type", 0);
        setField(term3388, term3388.getClass(), "next", null);
        setField(term3388, term3388.getClass(), "first", null);
        setField(term3388, term3388.getClass(), "last", null);
        setField(term3388, term3388.getClass(), "propListHead", null);
        setIntField(term3388, term3388.getClass(), "sourcePosition", 0);
        setField(term3388, term3388.getClass(), "jsType", null);
        setField(term3388, term3388.getClass(), "parent", null);
        setField(term3380, term3380.getClass(), "last", term3388);
        setField(term3391, term3391.getClass(), "next", null);
        setIntField(term3391, term3391.getClass(), "type", 0);
        setIntField(term3391, term3391.getClass(), "intValue", 0);
        setField(term3391, term3391.getClass(), "objectValue", null);
        setField(term3380, term3380.getClass(), "propListHead", term3391);
        setIntField(term3380, term3380.getClass(), "sourcePosition", 339854490);
        setField(term3380, term3380.getClass(), "jsType", null);
        setField(term3380, term3380.getClass(), "parent", null);
        setField(term3378, term3378.getClass(), "next", term3380);
        setIntField(term3395, term3395.getClass(), "type", 0);
        setField(term3395, term3395.getClass(), "next", null);
        setField(term3395, term3395.getClass(), "first", null);
        setField(term3395, term3395.getClass(), "last", null);
        setField(term3395, term3395.getClass(), "propListHead", null);
        setIntField(term3395, term3395.getClass(), "sourcePosition", 0);
        setField(term3395, term3395.getClass(), "jsType", null);
        setField(term3395, term3395.getClass(), "parent", null);
        setField(term3378, term3378.getClass(), "first", term3395);
        setIntField(term3398, term3398.getClass(), "type", 0);
        setField(term3398, term3398.getClass(), "next", null);
        setField(term3398, term3398.getClass(), "first", null);
        setField(term3398, term3398.getClass(), "last", null);
        setField(term3398, term3398.getClass(), "propListHead", null);
        setIntField(term3398, term3398.getClass(), "sourcePosition", 0);
        setField(term3398, term3398.getClass(), "jsType", null);
        setField(term3398, term3398.getClass(), "parent", null);
        setField(term3378, term3378.getClass(), "last", term3398);
        setField(term3401, term3401.getClass(), "next", null);
        setIntField(term3401, term3401.getClass(), "type", 0);
        setIntField(term3401, term3401.getClass(), "intValue", 0);
        setField(term3401, term3401.getClass(), "objectValue", null);
        setField(term3378, term3378.getClass(), "propListHead", term3401);
        setIntField(term3378, term3378.getClass(), "sourcePosition", -615654495);
        setField(term3378, term3378.getClass(), "jsType", null);
        setField(term3378, term3378.getClass(), "parent", null);
        setField(term3315, term3315.getClass(), "rootNodeJsDocHolder", term3378);
        setField(term3405, term3405.getClass(), "this$0", null);
        setField(term3315, term3315.getClass(), "fileLevelJsDocBuilder", term3405);
        setField(term3406, term3406.getClass(), "info", null);
        setField(term3406, term3406.getClass(), "documentation", null);
        setField(term3406, term3406.getClass(), "sourceName", null);
        setField(term3406, term3406.getClass(), "visibility", null);
        setIntField(term3406, term3406.getClass(), "bitset", 0);
        setField(term3406, term3406.getClass(), "type", null);
        setField(term3406, term3406.getClass(), "thisType", null);
        setBooleanField(term3406, term3406.getClass(), "includeDocumentation", false);
        setField(term3315, term3315.getClass(), "fileOverviewInfo", term3406);
        setIntField(term3409, term3409.getClass(), "type", 0);
        setField(term3409, term3409.getClass(), "next", null);
        setField(term3409, term3409.getClass(), "first", null);
        setField(term3409, term3409.getClass(), "last", null);
        setField(term3409, term3409.getClass(), "propListHead", null);
        setIntField(term3409, term3409.getClass(), "sourcePosition", 0);
        setField(term3409, term3409.getClass(), "jsType", null);
        setField(term3409, term3409.getClass(), "parent", null);
        setField(term3315, term3315.getClass(), "templateNode", term3409);
        Class<? extends Object> term14651 = Class.forName((String) "com.google.javascript.jscomp.mozilla.rhino.Token$CommentType");
        Field term14650 = ((Class) term14651).getDeclaredField((String) "BLOCK");
        ((Field) term14650).setAccessible(true);
        Object enum18 = ((Field) term14650).get((Object) null);
        term3412 = newInstance(Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        Object term3438 = newInstance(Class.forName("com.google.javascript.jscomp.mozilla.rhino.Node"));
        Object term3440 = newInstance(Class.forName("com.google.javascript.jscomp.mozilla.rhino.Node"));
        Object term3443 = newInstance(Class.forName("com.google.javascript.jscomp.mozilla.rhino.Node"));
        Object term3446 = newInstance(Class.forName("com.google.javascript.jscomp.mozilla.rhino.Node"));
        Object term3450 = newInstance(Class.forName("com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem"));
        Object term3453 = newInstance(Class.forName("com.google.javascript.jscomp.mozilla.rhino.Node"));
        Object term3456 = newInstance(Class.forName("com.google.javascript.jscomp.mozilla.rhino.Node"));
        Object term3460 = newInstance(Class.forName("com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem"));
        setField(term3412, term3412.getClass(), "value", "EeBVbzjcCI");
        setField(term3412, term3412.getClass(), "commentType", enum18);
        setBooleanField(term3412, term3412.getClass(), "parsed", true);
        setIntField(term3412, term3412.getClass(), "position", -1476117762);
        setIntField(term3412, term3412.getClass(), "length", -341962980);
        setField(term3412, term3412.getClass(), "parent", null);
        setIntField(term3412, term3412.getClass(), "type", 890669485);
        setIntField(term3438, term3438.getClass(), "type", 906181092);
        setIntField(term3440, term3440.getClass(), "type", 0);
        setField(term3440, term3440.getClass(), "next", null);
        setField(term3440, term3440.getClass(), "first", null);
        setField(term3440, term3440.getClass(), "last", null);
        setIntField(term3440, term3440.getClass(), "lineno", 0);
        setField(term3440, term3440.getClass(), "propListHead", null);
        setField(term3438, term3438.getClass(), "next", term3440);
        setIntField(term3443, term3443.getClass(), "type", 0);
        setField(term3443, term3443.getClass(), "next", null);
        setField(term3443, term3443.getClass(), "first", null);
        setField(term3443, term3443.getClass(), "last", null);
        setIntField(term3443, term3443.getClass(), "lineno", 0);
        setField(term3443, term3443.getClass(), "propListHead", null);
        setField(term3438, term3438.getClass(), "first", term3443);
        setIntField(term3446, term3446.getClass(), "type", 0);
        setField(term3446, term3446.getClass(), "next", null);
        setField(term3446, term3446.getClass(), "first", null);
        setField(term3446, term3446.getClass(), "last", null);
        setIntField(term3446, term3446.getClass(), "lineno", 0);
        setField(term3446, term3446.getClass(), "propListHead", null);
        setField(term3438, term3438.getClass(), "last", term3446);
        setIntField(term3438, term3438.getClass(), "lineno", 1386130016);
        setField(term3450, term3450.getClass(), "next", null);
        setIntField(term3450, term3450.getClass(), "type", 0);
        setIntField(term3450, term3450.getClass(), "intValue", 0);
        setField(term3450, term3450.getClass(), "objectValue", null);
        setField(term3438, term3438.getClass(), "propListHead", term3450);
        setField(term3412, term3412.getClass(), "next", term3438);
        setIntField(term3453, term3453.getClass(), "type", 0);
        setField(term3453, term3453.getClass(), "next", null);
        setField(term3453, term3453.getClass(), "first", null);
        setField(term3453, term3453.getClass(), "last", null);
        setIntField(term3453, term3453.getClass(), "lineno", 0);
        setField(term3453, term3453.getClass(), "propListHead", null);
        setField(term3412, term3412.getClass(), "first", term3453);
        setIntField(term3456, term3456.getClass(), "type", 0);
        setField(term3456, term3456.getClass(), "next", null);
        setField(term3456, term3456.getClass(), "first", null);
        setField(term3456, term3456.getClass(), "last", null);
        setIntField(term3456, term3456.getClass(), "lineno", 0);
        setField(term3456, term3456.getClass(), "propListHead", null);
        setField(term3412, term3412.getClass(), "last", term3456);
        setIntField(term3412, term3412.getClass(), "lineno", 1861318859);
        setField(term3460, term3460.getClass(), "next", null);
        setIntField(term3460, term3460.getClass(), "type", 0);
        setIntField(term3460, term3460.getClass(), "intValue", 0);
        setField(term3460, term3460.getClass(), "objectValue", null);
        setField(term3412, term3412.getClass(), "propListHead", term3460);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.Comment");
        Object[] args = new Object[1];
        args[0] = term3412;
        try {
            callMethod(klass, "handlePossibleFileOverviewJsDoc", argTypes, term3315, args);
            assertTrue(false);
        }
        catch (MissingResourceException e) {
        }

    }

};



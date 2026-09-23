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
import java.util.ArrayList;
import java.lang.Object;
import java.lang.String;

public class CollapseProperties_flattenPrefixes_357402923284 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term199710;
     Object term199814;

    public CollapseProperties_flattenPrefixes_357402923284() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term199710 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseProperties"));
        Class<? extends Object> term206385 = Class.forName((String) "com.google.javascript.jscomp.GlobalNamespace$Ref$Type");
        Field term206384 = ((Class) term206385).getDeclaredField((String) "CALL_GET");
        ((Field) term206384).setAccessible(true);
        Object enum266 = ((Field) term206384).get((Object) null);
        Class<? extends Object> term206681 = Class.forName((String) "com.google.javascript.jscomp.GlobalNamespace$Ref$Type");
        Field term206680 = ((Class) term206681).getDeclaredField((String) "PROTOTYPE_GET");
        ((Field) term206680).setAccessible(true);
        Object enum267 = ((Field) term206680).get((Object) null);
        Class<? extends Object> term206992 = Class.forName((String) "com.google.javascript.jscomp.GlobalNamespace$Ref$Type");
        Field term206991 = ((Class) term206992).getDeclaredField((String) "ALIASING_GET");
        ((Field) term206991).setAccessible(true);
        Object enum268 = ((Field) term206991).get((Object) null);
        Object term199968 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        Object term200070 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        Object term200172 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        Object term200274 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        setField(term200172, term200172.getClass(), "twin", term200274);
        setField(term200172, term200172.getClass(), "type", enum266);
        setField(term200070, term200070.getClass(), "twin", term200172);
        setField(term200070, term200070.getClass(), "type", enum267);
        setField(term199968, term199968.getClass(), "twin", term200070);
        setField(term199968, term199968.getClass(), "type", enum268);
        Class<? extends Object> term207300 = Class.forName((String) "com.google.javascript.jscomp.GlobalNamespace$Ref$Type");
        Field term207299 = ((Class) term207300).getDeclaredField((String) "DIRECT_GET");
        ((Field) term207299).setAccessible(true);
        Object enum269 = ((Field) term207299).get((Object) null);
        Object term200826 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        Object term200928 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        setField(term200928, term200928.getClass(), "twin", term200070);
        setField(term200928, term200928.getClass(), "type", enum269);
        setField(term200826, term200826.getClass(), "twin", term200928);
        setField(term200826, term200826.getClass(), "type", enum268);
        Object term201180 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        Object term201282 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        setField(term201282, term201282.getClass(), "twin", term200172);
        setField(term201282, term201282.getClass(), "type", enum268);
        setField(term201180, term201180.getClass(), "twin", term201282);
        setField(term201180, term201180.getClass(), "type", enum269);
        Object term201384 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        Object term201486 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        Object term201588 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        setField(term201588, term201588.getClass(), "twin", term200070);
        setField(term201588, term201588.getClass(), "type", enum266);
        setField(term201486, term201486.getClass(), "twin", term201588);
        setField(term201486, term201486.getClass(), "type", enum268);
        setField(term201384, term201384.getClass(), "twin", term201486);
        setField(term201384, term201384.getClass(), "type", enum267);
        Object term201690 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        Object term201792 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        setField(term201792, term201792.getClass(), "twin", term199968);
        setField(term201792, term201792.getClass(), "type", enum267);
        setField(term201690, term201690.getClass(), "twin", term201792);
        setField(term201690, term201690.getClass(), "type", enum268);
        Object term201894 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        setField(term201894, term201894.getClass(), "twin", term201384);
        setField(term201894, term201894.getClass(), "type", enum266);
        Object term201996 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        setField(term201996, term201996.getClass(), "twin", term200172);
        setField(term201996, term201996.getClass(), "type", enum268);
        Object term202098 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        setField(term202098, term202098.getClass(), "twin", term200274);
        setField(term202098, term202098.getClass(), "type", enum268);
        Object term202200 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        Object term202302 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        setField(term202200, term202200.getClass(), "twin", term202302);
        setField(term202200, term202200.getClass(), "type", enum269);
        Object term202404 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        setField(term202404, term202404.getClass(), "twin", term200070);
        setField(term202404, term202404.getClass(), "type", enum269);
        Object term202506 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        setField(term202506, term202506.getClass(), "twin", term201384);
        setField(term202506, term202506.getClass(), "type", enum269);
        Object term202608 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        setField(term202608, term202608.getClass(), "twin", term201690);
        setField(term202608, term202608.getClass(), "type", enum266);
        Object term202710 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        setField(term202710, term202710.getClass(), "twin", null);
        ArrayList term199866 = new ArrayList();
        ((ArrayList) term199866).add(term199968);
        ((ArrayList) term199866).add(term200826);
        ((ArrayList) term199866).add(term201180);
        ((ArrayList) term199866).add(term200172);
        ((ArrayList) term199866).add(term201180);
        ((ArrayList) term199866).add(term201384);
        ((ArrayList) term199866).add(term201180);
        ((ArrayList) term199866).add(term201690);
        ((ArrayList) term199866).add(term201894);
        ((ArrayList) term199866).add(term199968);
        ((ArrayList) term199866).add(term201996);
        ((ArrayList) term199866).add(term201180);
        ((ArrayList) term199866).add(term200826);
        ((ArrayList) term199866).add(term202098);
        ((ArrayList) term199866).add(term199968);
        ((ArrayList) term199866).add(term202200);
        ((ArrayList) term199866).add(term202404);
        ((ArrayList) term199866).add(term201588);
        ((ArrayList) term199866).add(term201996);
        ((ArrayList) term199866).add(term200070);
        ((ArrayList) term199866).add(term201486);
        ((ArrayList) term199866).add(term201792);
        ((ArrayList) term199866).add(term201282);
        ((ArrayList) term199866).add(term201486);
        ((ArrayList) term199866).add(term201996);
        ((ArrayList) term199866).add(term201180);
        ((ArrayList) term199866).add(term200928);
        ((ArrayList) term199866).add(term200070);
        ((ArrayList) term199866).add(term202200);
        ((ArrayList) term199866).add(term202506);
        ((ArrayList) term199866).add(term202608);
        ((ArrayList) term199866).add(term199968);
        ((ArrayList) term199866).add(term202710);
        term199814 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name"));
        setField(term199814, term199814.getClass(), "parent", null);
        setField(term199814, term199814.getClass(), "name", null);
        setField(term199814, term199814.getClass(), "declaration", null);
        setField(term199814, term199814.getClass(), "refs", term199866);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term199814;
        args[2] = 0;
        try {
            callMethod(klass, "flattenPrefixes", argTypes, term199710, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



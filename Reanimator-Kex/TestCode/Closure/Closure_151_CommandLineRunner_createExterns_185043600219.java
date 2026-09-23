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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.jscomp.EqualityUtils.*;
import java.lang.Object;
import java.util.ArrayList;

public class CommandLineRunner_createExterns_185043600219 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36720;
     Object term37394;
     Object term37352;

    public CommandLineRunner_createExterns_185043600219() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term36922 = new ArrayList();
        term36720 = newInstance(Class.forName("com.google.javascript.jscomp.CommandLineRunner"));
        Object term36870 = newInstance(Class.forName("com.google.javascript.jscomp.AbstractCommandLineRunner$CommandLineConfig"));
        Object term37032 = newInstance(Class.forName("com.google.javascript.jscomp.CommandLineRunner$Flags"));
        setBooleanField(term36720, term36720.getClass(), "testMode", false);
        setField(term36870, term36870.getClass(), "externs", term36922);
        setField(term36720, term36720.getClass(), "config", term36870);
        setBooleanField(term37032, term37032.getClass(), "use_only_custom_externs", true);
        setField(term36720, term36720.getClass(), "flags", term37032);
        ArrayList term37397 = new ArrayList();
        term37394 = newInstance(Class.forName("com.google.javascript.jscomp.CommandLineRunner"));
        Object term37395 = newInstance(Class.forName("com.google.javascript.jscomp.CommandLineRunner$Flags"));
        Object term37396 = newInstance(Class.forName("com.google.javascript.jscomp.AbstractCommandLineRunner$CommandLineConfig"));
        setBooleanField(term37395, term37395.getClass(), "display_help", false);
        setBooleanField(term37395, term37395.getClass(), "print_tree", false);
        setBooleanField(term37395, term37395.getClass(), "compute_phase_ordering", false);
        setBooleanField(term37395, term37395.getClass(), "print_ast", false);
        setBooleanField(term37395, term37395.getClass(), "print_pass_graph", false);
        setField(term37395, term37395.getClass(), "jscomp_dev_mode", null);
        setField(term37395, term37395.getClass(), "logging_level", null);
        setField(term37395, term37395.getClass(), "externs", null);
        setField(term37395, term37395.getClass(), "js", null);
        setField(term37395, term37395.getClass(), "js_output_file", null);
        setField(term37395, term37395.getClass(), "module", null);
        setField(term37395, term37395.getClass(), "variable_map_input_file", null);
        setField(term37395, term37395.getClass(), "property_map_input_file", null);
        setField(term37395, term37395.getClass(), "variable_map_output_file", null);
        setBooleanField(term37395, term37395.getClass(), "create_name_map_files", false);
        setField(term37395, term37395.getClass(), "property_map_output_file", null);
        setBooleanField(term37395, term37395.getClass(), "third_party", false);
        setIntField(term37395, term37395.getClass(), "summary_detail_level", 0);
        setField(term37395, term37395.getClass(), "output_wrapper", null);
        setField(term37395, term37395.getClass(), "output_wrapper_marker", null);
        setField(term37395, term37395.getClass(), "module_wrapper", null);
        setField(term37395, term37395.getClass(), "module_output_path_prefix", null);
        setField(term37395, term37395.getClass(), "create_source_map", null);
        setField(term37395, term37395.getClass(), "jscomp_error", null);
        setField(term37395, term37395.getClass(), "jscomp_warning", null);
        setField(term37395, term37395.getClass(), "jscomp_off", null);
        setField(term37395, term37395.getClass(), "define", null);
        setField(term37395, term37395.getClass(), "charset", null);
        setField(term37395, term37395.getClass(), "compilation_level", null);
        setField(term37395, term37395.getClass(), "warning_level", null);
        setBooleanField(term37395, term37395.getClass(), "use_only_custom_externs", true);
        setBooleanField(term37395, term37395.getClass(), "debug", false);
        setField(term37395, term37395.getClass(), "formatting", null);
        setBooleanField(term37395, term37395.getClass(), "process_closure_primitives", false);
        setBooleanField(term37395, term37395.getClass(), "manage_closure_dependencies", false);
        setField(term37395, term37395.getClass(), "output_manifest", null);
        setField(term37394, term37394.getClass(), "flags", term37395);
        setBooleanField(term37394, term37394.getClass(), "isConfigValid", false);
        setBooleanField(term37396, term37396.getClass(), "printTree", false);
        setBooleanField(term37396, term37396.getClass(), "computePhaseOrdering", false);
        setBooleanField(term37396, term37396.getClass(), "printAst", false);
        setBooleanField(term37396, term37396.getClass(), "printPassGraph", false);
        setField(term37396, term37396.getClass(), "jscompDevMode", null);
        setField(term37396, term37396.getClass(), "loggingLevel", null);
        setField(term37396, term37396.getClass(), "externs", term37397);
        setField(term37396, term37396.getClass(), "js", null);
        setField(term37396, term37396.getClass(), "jsOutputFile", null);
        setField(term37396, term37396.getClass(), "module", null);
        setField(term37396, term37396.getClass(), "variableMapInputFile", null);
        setField(term37396, term37396.getClass(), "propertyMapInputFile", null);
        setField(term37396, term37396.getClass(), "variableMapOutputFile", null);
        setBooleanField(term37396, term37396.getClass(), "createNameMapFiles", false);
        setField(term37396, term37396.getClass(), "propertyMapOutputFile", null);
        setField(term37396, term37396.getClass(), "codingConvention", null);
        setIntField(term37396, term37396.getClass(), "summaryDetailLevel", 0);
        setField(term37396, term37396.getClass(), "outputWrapper", null);
        setField(term37396, term37396.getClass(), "outputWrapperMarker", null);
        setField(term37396, term37396.getClass(), "moduleWrapper", null);
        setField(term37396, term37396.getClass(), "moduleOutputPathPrefix", null);
        setField(term37396, term37396.getClass(), "createSourceMap", null);
        setField(term37396, term37396.getClass(), "sourceMapDetailLevel", null);
        setField(term37396, term37396.getClass(), "sourceMapFormat", null);
        setField(term37396, term37396.getClass(), "jscompError", null);
        setField(term37396, term37396.getClass(), "jscompWarning", null);
        setField(term37396, term37396.getClass(), "jscompOff", null);
        setField(term37396, term37396.getClass(), "define", null);
        setField(term37396, term37396.getClass(), "charset", null);
        setBooleanField(term37396, term37396.getClass(), "manageClosureDependencies", false);
        setField(term37396, term37396.getClass(), "outputManifest", null);
        setField(term37394, term37394.getClass(), "config", term37396);
        setField(term37394, term37394.getClass(), "out", null);
        setField(term37394, term37394.getClass(), "err", null);
        setField(term37394, term37394.getClass(), "compiler", null);
        setField(term37394, term37394.getClass(), "inputCharset", null);
        setField(term37394, term37394.getClass(), "outputCharset", null);
        setBooleanField(term37394, term37394.getClass(), "testMode", false);
        setField(term37394, term37394.getClass(), "externsSupplierForTesting", null);
        setField(term37394, term37394.getClass(), "inputsSupplierForTesting", null);
        setField(term37394, term37394.getClass(), "modulesSupplierForTesting", null);
        setField(term37394, term37394.getClass(), "exitCodeReceiverForTesting", null);
        setField(term37394, term37394.getClass(), "runTimeStats", null);
        term37352 = newInstance(Class.forName("com.google.common.collect.SingletonImmutableList"));
        Object term37353 = newInstance(Class.forName("com.google.javascript.jscomp.JSSourceFile"));
        Object term37354 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile$Preloaded"));
        setField(term37354, term37354.getClass(), "fileName", "/dev/null");
        setField(term37354, term37354.getClass(), "originalPath", "/dev/null");
        setIntField(term37354, term37354.getClass(), "lastOffset", 0);
        setIntField(term37354, term37354.getClass(), "lastLine", 1);
        setField(term37354, term37354.getClass(), "code", "");
        setField(term37353, term37353.getClass(), "referenced", term37354);
        setField(term37353, term37353.getClass(), "fileName", "/dev/null");
        setField(term37353, term37353.getClass(), "originalPath", null);
        setIntField(term37353, term37353.getClass(), "lastOffset", 0);
        setIntField(term37353, term37353.getClass(), "lastLine", 1);
        setField(term37353, term37353.getClass(), "code", null);
        setField(term37352, term37352.getClass(), "element", term37353);
        setField(term37352, term37352.getClass(), "asList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CommandLineRunner");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "createExterns", argTypes, term36720, args);
        assertTrue(recursiveEquals(term36720, term37394));
        assertTrue(recursiveEquals(retValue, term37352));
    }

};



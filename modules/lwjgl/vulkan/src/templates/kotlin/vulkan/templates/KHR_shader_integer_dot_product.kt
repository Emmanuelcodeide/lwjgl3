/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_shader_integer_dot_product = "KHRShaderIntegerDotProduct".nativeClassVK("KHR_shader_integer_dot_product", type = "device", postfix = "KHR") {
    documentation =
        """
        This extension adds support for the integer dot product SPIR-V instructions defined in SPV_KHR_integer_dot_product. These instructions are particularly useful for neural network inference and training but find uses in other general purpose compute applications as well.

        <h5>Promotion to Vulkan 1.3</h5>
        Functionality in this extension is included in core Vulkan 1.3, with the KHR suffix omitted. The original type, enum and command names are still available as aliases of the core functionality.

        <h5>VK_KHR_shader_integer_dot_product</h5>
        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_KHR_shader_integer_dot_product}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>281</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd><ul>
                <li>Requires support for Vulkan 1.0</li>
                <li>Requires {@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2} to be enabled for any device-level functionality</li>
            </ul></dd>

            <dt><b>Deprecation state</b></dt>
            <dd><ul>
                <li><em>Promoted</em> to <a target="_blank" href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#versions-1.3-promotions">Vulkan 1.3</a></li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Kevin Petit <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_KHR_shader_integer_dot_product]%20@kevinpetit%250A*Here%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_KHR_shader_integer_dot_product%20extension*">kevinpetit</a></li>
            </ul></dd>

            <dt><b>Extension Proposal</b></dt>
            <dd><a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/tree/main/proposals/VK_KHR_shader_integer_dot_product.adoc">VK_KHR_shader_integer_dot_product</a></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2021-06-16</dd>

            <dt><b>Interactions and External Dependencies</b></dt>
            <dd><ul>
                <li>Promoted to Vulkan 1.3 Core</li>
                <li>This extension requires <a target="_blank" href="https://htmlpreview.github.io/?https://github.com/KhronosGroup/SPIRV-Registry/blob/master/extensions/KHR/SPV_KHR_integer_dot_product.html">{@code SPV_KHR_integer_dot_product}</a>.</li>
                <li>This extension interacts with {@link KHRShaderFloat16Int8 VK_KHR_shader_float16_int8}.</li>
            </ul></dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Kévin Petit, Arm Ltd.</li>
                <li>Jeff Bolz, NVidia</li>
                <li>Spencer Fricke, Samsung</li>
                <li>Jesse Hall, Google</li>
                <li>John Kessenich, Google</li>
                <li>Graeme Leese, Broadcom</li>
                <li>Einar Hov, Arm Ltd.</li>
                <li>Stuart Brady, Arm Ltd.</li>
                <li>Pablo Cascon, Arm Ltd.</li>
                <li>Tobias Hector, AMD</li>
                <li>Jeff Leger, Qualcomm</li>
                <li>Ruihao Zhang, Qualcomm</li>
                <li>Pierre Boudier, NVidia</li>
                <li>Jon Leech, The Khronos Group</li>
                <li>Tom Olson, Arm Ltd.</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "KHR_SHADER_INTEGER_DOT_PRODUCT_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "KHR_SHADER_INTEGER_DOT_PRODUCT_EXTENSION_NAME".."VK_KHR_shader_integer_dot_product"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_INTEGER_DOT_PRODUCT_FEATURES_KHR".."1000280000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_INTEGER_DOT_PRODUCT_PROPERTIES_KHR".."1000280001"
    )
}